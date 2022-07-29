package com.verta.entity;

public class Lunch {
    private Meal meal;
    private Dessert dessert;

    public Lunch(Meal meal, Dessert dessert) {
        this.meal = meal;
        this.dessert = dessert;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Lunch{" +
                "meal=" + meal +
                ", dessert=" + dessert +
                '}';
    }
}
