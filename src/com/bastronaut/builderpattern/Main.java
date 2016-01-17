package com.bastronaut.builderpattern;

/**
 * Created by BSijtsma on 12-01-2016.
 */

/*
Solves common problem of determining what constructor to use.
Oftentime multiple constructor (telescoping) becomes confusing.
Often made with static inner class, as to return object its building

How it works: create a static class Builder.
Within this class, 'setter' methods are added named according
to the respective fields.

Can also enforce protection by removing all setter methods.

When you want to instantiate a LunchOrder, you will first have
to instantiate the LunchOrder.Builder() class. Then, you're free
to define as many of the available fields as you'd like, then
call the LunchOrder.build() method.
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
