package ru.pizza.models;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    protected final Dough dough;
    protected final Sauce sauce;
    protected final List<Ingredient> ingredients = new ArrayList<>();

    public Pizza(Dough dough, Sauce sauce) {
        this.sauce = sauce;
        this.dough = dough;
        createDefaultPizza();
    }

    /** Получить значение поля name */
    public String getName() {
        return getClass().getSimpleName();
    }

    /** Получить значение поля cost */
    public double getCost() {
        return dough.getCost() * sauce.getCost() * getIngredientCost();
    }

    /** Получить значение getIngredientCost */
    public double getIngredientCost() {
        double totalPrice = 0.00;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getCost();
        }
        return totalPrice;
    };

    /** Получить значение поля ingredients */
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    /** Получить значение поля ingredients */
    public void addIngredients(List<Ingredient> ingredients) {
        this.ingredients.addAll(ingredients);
    }


    protected abstract void createDefaultPizza();

    /** Получить значение поля id */
    public abstract long getId();
}
