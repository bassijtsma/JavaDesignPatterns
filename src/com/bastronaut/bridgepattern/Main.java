package com.bastronaut.bridgepattern;

/**
 * Created by Bas on 17-1-2016.
 */
/*
Looks similar to adapter pattern. However, the bridge pattern
is planned in advance, rather than done to deal with legacy
code. It's meant to decouple abstraction and implementation,
using encapsulation, composition and inheritance. It is designed
so that changes in abstraction will not affect the client.
This can be done when you know the details won't be right
from the start.

Bridge pattern makes it easy to extend and implement more
classes later. for instance: we can add another color
without having to modify the color base class. or,
we could apply a color to a different shape without
having to modify the base classes.
 */


public class Main {
    public static void main(String[] args) {

        Color red = new Red();
        Shape square = new Square(red);

        Color green = new Green();
        Shape circle = new Circle(green);

        circle.applyColor();
        square.applyColor();
    }
}
