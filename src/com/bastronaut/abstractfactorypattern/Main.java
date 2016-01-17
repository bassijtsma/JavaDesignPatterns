package com.bastronaut.abstractfactorypattern;

/**
 * Created by BSijtsma on 15-01-2016.
 */

// Encapsulates a group of factories with a common theme
// without specifying their concrete classes. factory
// of factories. Common interface that is carried through
// abstract factory, to the concrete factory, to the
// implementing class below. Parameterized create method.
// Often created with composition instead of inheritance.
// example: DocumentBuilderFactory from java api
public class Main {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);

        CreditCard visaCardGold = abstractFactory.getCreditCard(CardType.GOLD);
        CreditCard visaCardPlatinum = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(visaCardGold.getClass());
        System.out.println(visaCardPlatinum.getClass());




        }
    }

