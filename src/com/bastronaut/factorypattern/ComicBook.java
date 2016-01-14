package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
public class ComicBook extends Book {

    @Override
    public void createBook() {
        System.out.println("Creating a ComicBook!");
    }
}
