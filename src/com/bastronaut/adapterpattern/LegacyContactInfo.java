package com.bastronaut.adapterpattern;

/**
 * Created by Bas on 17-1-2016.
 */
public class LegacyContactInfo {

    private String givenName;
    private String emailAddress;
    private int currentAge;


    public LegacyContactInfo(String givenName, String emailAddress, int currentAge) {
        this.givenName = givenName;
        this.emailAddress = emailAddress;
        this.currentAge = currentAge;
    }

    public String getGivenName() {
        return givenName;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public int getCurrentAge() {
        return currentAge;
    }
}
