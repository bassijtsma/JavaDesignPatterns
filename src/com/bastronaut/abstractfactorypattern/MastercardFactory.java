package com.bastronaut.abstractfactorypattern;

/**
 * Created by Bas on 16-1-2016.
 */
public class MastercardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new MastercardGoldCreditCard();
            case PLATINUM:
                return new MastercardBlackCreditCard();
        }
        return null;
    }
}
