package com.bastronaut.builderpattern;

/**
 * Created by BSijtsma on 12-01-2016.
 */

public class Main {
    public static void main(String[] args ) {
        LunchOrder.Builder lunchBuilderPattern = new LunchOrder.Builder();
        // pattern allows to define as many/little fields as you'd like,
        // in the order that you'd like (e.g. meat is not used).
        lunchBuilderPattern.bread("wheat").dressing("Ketchup").condiments("cheese");

        LunchOrder lunchOrder = lunchBuilderPattern.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
    }

}
