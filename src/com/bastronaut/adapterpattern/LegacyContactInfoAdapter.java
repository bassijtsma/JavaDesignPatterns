package com.bastronaut.adapterpattern;

/**
 * Created by Bas on 17-1-2016.
 */
public class LegacyContactInfoAdapter implements Contact {

    private LegacyContactInfo instance;

    public LegacyContactInfoAdapter(LegacyContactInfo instance){
        this.instance = instance;
    }

    @Override
    public String getName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public int getAge() {
        return instance.getCurrentAge();
    }
}
