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

public abstract class Item implements Cloneable {
    public String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
