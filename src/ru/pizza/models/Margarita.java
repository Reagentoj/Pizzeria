package ru.pizza.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Margarita extends Pizza {
    private final List<String> ingredients = new ArrayList<>();
    private final static String NAME = "Margarita";

    public Margarita(Dough dough, Sauce sauce) {
        super(dough, sauce);
        createDefaultPizza();
    }

    private void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredients.Tomatoes.toString()));
    }

    @Override
    public long getId() {
        return Ids.MargaritaId;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getCost() {
        return dough.getCost() * sauce.getCost() * getPriceFromIngredients();
    }

    @Override
    double getIngredientCost() {
        return 0;
    }

    private double getPriceFromIngredients() {
        double price = 0.0;
//        for () {
//
//        }
        return price;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    void addIngredients(List<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }
}
