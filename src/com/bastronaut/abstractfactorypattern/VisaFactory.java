package com.bastronaut.abstractfactorypattern;

/**
 * Created by Bas on 16-1-2016.
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }
        return null;
    }


}
