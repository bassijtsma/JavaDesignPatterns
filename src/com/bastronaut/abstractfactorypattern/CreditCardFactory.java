package com.bastronaut.abstractfactorypattern;

/**
 * Created by Bas on 16-1-2016.
 */
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore < 650) {
            return new MastercardFactory();
        } else {
            return new VisaFactory();
        }
    }
}
