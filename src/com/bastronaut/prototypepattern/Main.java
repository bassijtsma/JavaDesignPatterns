package com.bastronaut.prototypepattern;

/**
 * Created by BSijtsma on 13-01-2016.
 */

/*
Done to avoid costly creation and subclassing.
Typically does not use the new keyword, and often utilizes an interface
usually implemented with registry.
If object is expensive to create, but we can obtain it by copying,
the prototype pattern is a good fit. Typically implements clone/cloneable.
Can do either deep or shallow copy (references or value copy).

 Think of this as amazon: if object displayed for all items on page,
 it would become very expensive.
 */

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational pattern");

        System.out.println(movie);
        System.out.println(movie.getMovieDuration());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Star Trek");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getMovieDuration());

    }

}
