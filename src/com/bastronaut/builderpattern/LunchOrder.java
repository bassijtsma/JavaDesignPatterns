package com.bastronaut.builderpattern;

/**
 * Created by BSijtsma on 12-01-2016.
 */
/*
Solves common problem of determining what constructor to use.
Oftentime multiple constructor (telescoping) becomes confusing.
Often made with static inner class, as to return object its building

How it works: create a static class Builder.
Within this class, 'setter' methods are added named according
to the respective fields.

Can also enforce protection by removing all setter methods.

When you want to instantiate a LunchOrder, you will first have
to instantiate the LunchOrder.Builder() class. Then, you're free
to define as many of the available fields as you'd like, then
call the LunchOrder.build() method.
 */
public class LunchOrder {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() { }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder addBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder addCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder addDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder addMeat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
