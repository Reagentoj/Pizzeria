package ru.pizza.models;

public enum Ingredients {
    Tomatoes(1.25),

    Jalapeno(2.00),

    Chilli(1.00),

    Capers(2.50),

    Parmesan(1.50),

    Olives(3.00);

    private double cost;
    Ingredients(double cost){
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
