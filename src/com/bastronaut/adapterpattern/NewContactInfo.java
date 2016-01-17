package com.bastronaut.adapterpattern;

/**
 * Created by Bas on 17-1-2016.
 */
public class NewContactInfo implements Contact {

    private String name;
    private String email;
    private int age;

    public NewContactInfo(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getAge() {
        return age;
    }
}

