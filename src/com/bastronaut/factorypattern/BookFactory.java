package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
public class BookFactory {

    public static Book getBook(String booktype) {
        switch (booktype) {
            case "ComicBook" :
                return new ComicBook();
            case "Novel" :
                return new Novel();
            default :
                return null;
        }
    }
}
