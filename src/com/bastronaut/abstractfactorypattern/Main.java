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

        CreditCardFactory richAbstractFactory = CreditCardFactory.getCreditCardFactory(10000);

        CreditCard richGoldCard = richAbstractFactory.getCreditCard(CardType.GOLD);
        CreditCard richPlatinumCard = richAbstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(richGoldCard.getClass());
        System.out.println(richPlatinumCard.getClass());

        CreditCardFactory poorAbstractFactory = CreditCardFactory.getCreditCardFactory(500);

        CreditCard poorGoldCard = poorAbstractFactory.getCreditCard(CardType.GOLD);
        CreditCard poorPlatinumdCard = poorAbstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(poorPlatinumdCard.getClass());
        System.out.println(poorGoldCard.getClass());


        }
    }

