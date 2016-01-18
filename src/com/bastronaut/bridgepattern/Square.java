package com.bastronaut.bridgepattern;

/**
 * Created by BSijtsma on 18-01-2016.
 */
public class Square extends Shape {


    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
