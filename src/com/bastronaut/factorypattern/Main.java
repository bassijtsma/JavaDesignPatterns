package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
/*
Hides the instantiation logic, only exposing the interface.
Defers to subclasses. Works with parameterized create method
 */
public class Main {

    public static void main (String[] args) {
        Book ComicBook = BookFactory.getBook("ComicBook");
        Book Novel = BookFactory.getBook("Novel");
    }
}
