package com.bastronaut.singleton;

/*
Guarantees only single instance is created,
and instantiation is controlled. Also responsible for its lifecycle.
Typically not implemented with static, as it is not thread safe.
Private instance and private constructor. No parameters, otherwise
its usually a sign of a factory pattern
Lazy loading: defer instantiation for efficiency by
setting initial Singleton instance to null, and not constructing
it until needed
*/

public class Main {

    public static void main(String[] args) {

        // Prints same address
        Singleton singletonInstance = Singleton.getSingleton();
        System.out.println(singletonInstance);
        Singleton singletonInstanceTwo = Singleton.getSingleton();
        System.out.println(singletonInstanceTwo);
    }
}
