package com.bastronaut.adapterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bas on 17-1-2016.
 */
/*
Think of this as a plug class. Cover functionality of
a class in an interface class. Often useful to cover access
to legacy systems, and help incompatible interfaces work together.

Implemented: An older legacy class (LegacyContactInfo) contains
fields and methods that the adapter class (LegacyContactInfoAdapter)
builds around. Adapter class in this case implements an interface
(contact) to cover the newly required functionality.


 */
public class Main {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();


        LegacyContactInfo legacyContactInfo = new LegacyContactInfo("bas" , "bas@test.com", 25);

        LegacyContactInfoAdapter legacyAdapter = new LegacyContactInfoAdapter(legacyContactInfo);


    }
}
