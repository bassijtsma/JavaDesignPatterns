package com.bastronaut.prototypepattern;

/**
 * Created by BSijtsma on 13-01-2016.
 */
public class Book extends Item {

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberofPages) {
        this.numberOfPages = numberofPages;
    }
}
