package com.bastronaut.factorypattern;

/**
 * Created by BSijtsma on 14-01-2016.
 */
public abstract class Book {

    public Book() {
        this.createBook();
    }

    public abstract void createBook();


}
