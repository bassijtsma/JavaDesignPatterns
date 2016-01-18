package com.bastronaut.bridgepattern;

/**
 * Created by BSijtsma on 18-01-2016.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public void applyColor();
}
