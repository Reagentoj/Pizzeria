package ru.pizza.models;

public enum Dough {
    Thin(2.0), // Тонкое тесто
    Thick(3.0); // Толстое тесто

    private double cost;
    Dough(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
