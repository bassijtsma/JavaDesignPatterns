package com.bastronaut.prototypepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BSijtsma on 13-01-2016.
 */
public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            // cast return item to Item class because of cloneable
            // implementation. (because Cloneable does not have generics)
            // alternatively create own clone functionality
            item = (Item)(items.get(type)).clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Star Wars 82");
        movie.setPrice(5);
        movie.setMovieDuration("3 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setPrice(6);
        book.setTitle("Harry Potter 9");
        book.setNumberOfPages(8491);
        items.put("Book", book);
    }
}
