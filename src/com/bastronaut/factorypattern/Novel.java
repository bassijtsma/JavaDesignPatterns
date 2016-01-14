package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
public class Novel extends Book {

    @Override
    public void createBook() {
        System.out.println("Creating a novel!");
    }
}
