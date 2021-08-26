package ru.pizza.models;

public enum Dough {
    Thin(1.0), // Тонкое тесто
    Thick(1.5); // Толстое тесто

    private double cost;

    Dough(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}