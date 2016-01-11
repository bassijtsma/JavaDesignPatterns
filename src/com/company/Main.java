package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Singleton singletonInstance = Singleton.getSingleton();
        System.out.println(singletonInstance);
    }
}
