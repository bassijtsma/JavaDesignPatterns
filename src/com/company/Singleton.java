package com.company;

/**
 * Created by BSijtsma on 11-01-2016.
 */

/*
Guarantees only single instance is created,
and instantiation is controlled. Also responsible for its lifecycle.
Typically not implemented with static, as it is not thread safe.
Private instance and private constructor. No parameters, otherwise
its usually a sign of a factory pattern
*/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton () { };

    public static Singleton getSingleton() {
        return instance;
    }
}
