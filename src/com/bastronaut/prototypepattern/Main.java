package com.bastronaut.prototypepattern;

/**
 * Created by BSijtsma on 13-01-2016.
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
