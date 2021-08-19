package ru.pizza.models;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class Pizza {
    protected final Dough dough;
    protected final Sauce sauce;

    public Pizza(Dough dough, Sauce sauce) {
        this.sauce = sauce;
        this.dough = dough;
    }

    /** Получить значение поля id */
    abstract long getId();

    /** Получить значение поля name */
    abstract String getName();

    /** Получить значение поля cost */
    abstract double getCost();

    /** Получить значение getIngredientCost */
    abstract double getIngredientCost();

    /** Получить значение поля ingredients */
    abstract List<String> getIngredients();

    /** Получить значение поля ingredients */
    abstract void addIngredients(List<String> ingredients);
}
