package com.bastronaut.singleton;

public class Main {

    public static void main(String[] args) {

        // Prints same address
        Singleton singletonInstance = Singleton.getSingleton();
        System.out.println(singletonInstance);
        Singleton singletonInstanceTwo = Singleton.getSingleton();
        System.out.println(singletonInstanceTwo);
    }
}
