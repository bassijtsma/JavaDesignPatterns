package com.bastronaut.bridgepattern;

/**
 * Created by BSijtsma on 18-01-2016.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
