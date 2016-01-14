package com.bastronaut.builderpattern;

/**
 * Created by BSijtsma on 12-01-2016.
 */

public class Main {
    public static void main(String[] args ) {
        LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
        // pattern allows to define as many/little fields as you'd like,
        // in the order that you'd like (e.g. addMeat is not used).
        lunchOrderBuilder.addBread("wheat").addDressing("Ketchup").addCondiments("cheese");

        LunchOrder lunchOrder = lunchOrderBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
    }

}
