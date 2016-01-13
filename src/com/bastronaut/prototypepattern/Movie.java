package com.bastronaut.prototypepattern;

/**
 * Created by BSijtsma on 13-01-2016.
 */
public class Movie extends Item {

    public String movieDuration;

    public String getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(String movieDuration){
        this.movieDuration = movieDuration;
    }
}
