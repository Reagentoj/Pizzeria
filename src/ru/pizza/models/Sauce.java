package ru.pizza.models;

public enum Sauce {
    Tomato(1),
    Cheese(1.5);

    private double cost;
    Sauce(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
