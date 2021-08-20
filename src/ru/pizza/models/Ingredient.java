package ru.pizza.models;

public enum Ingredient {
    Tomatoes(1.25),

    Jalapeno(2.00),

    Mushrooms(1.75),

    Chilli(1.00),

    Capers(2.50),

    Parmesan(1.50),

    Mozzarella(1.50),

    Emmental(1.25),

    Gorgonzola(1.75),

    Olives(3.00),

    Ham(1.25),

    Oregano(1.00),

    Oil(0.50),

    OliveOil(1.00);

    private double cost;
    Ingredient(double cost){
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
