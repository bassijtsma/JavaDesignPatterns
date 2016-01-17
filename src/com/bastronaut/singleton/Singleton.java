package com.bastronaut.singleton;

/**
 * Created by BSijtsma on 11-01-2016.
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
