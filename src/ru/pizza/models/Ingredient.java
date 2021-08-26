package ru.pizza.models;


public enum Ingredient {
    Tomatoes(0.25),

    Jalapeno(0.70),

    Mushrooms(0.75),

    Chilli(0.20),

    Capers(0.50),

    Parmesan(0.60),

    Mozzarella(0.80),

    Emmental(0.75),

    Gorgonzola(0.55),

    Olives(0.75),

    Ham(0.90),

    Oregano(0.35),

    Oil(0.10),

    OliveOil(0.15);

    private double cost;

    Ingredient(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
