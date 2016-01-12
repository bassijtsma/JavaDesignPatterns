package com.bastronaut.singleton;

/**
 * Created by BSijtsma on 11-01-2016.
 */

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
public class Singleton {
    private static Singleton instance = null;

    private Singleton () { }

    public static Singleton getSingleton() {
        if (instance == null) {
            // extra check for thread safety
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
