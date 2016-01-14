package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
/*
Hides the instantiation logic, only exposing the interface.
Defers to subclasses. Works with parameterized create method

Basically: The factory class decides which object to new up. It
instantiates an abstract superclass with a constructor calling
an abstract method. The subclasses implement this method

 */
public class Main {

    public static void main (String[] args) {
        Book ComicBook = BookFactory.getBook(BookType.COMICBOOK);
        Book Novel = BookFactory.getBook(BookType.NOVEL);
    }
}
