package com.verta.entity;

public enum Cuisines {
    POLISH ("Polish"),
    MEXICAN ("Mexican"),
    ITALIAN ("Italian");

    private String cuisine;

    Cuisines(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return "Cuisines{" +
                "cuisine='" + cuisine + '\'' +
                "} " + super.toString();
    }
}
