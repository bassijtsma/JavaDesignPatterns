package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
public class BookFactory {

    public static Book getBook(BookType booktype) {
        switch (booktype) {
            case COMICBOOK :
                return new ComicBook();
            case NOVEL :
                return new Novel();
            default :
                return null;
        }
    }
}
