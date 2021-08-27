package ru.pizza.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Pizza {
    protected final Dough dough;
    protected final Sauce sauce;
    protected final List<Ingredient> ingredients = new ArrayList<>();

    public Pizza(Dough dough, Sauce sauce) {
        this.sauce = sauce;
        this.dough = dough;
        createDefaultPizza();
    }

    /** Получить название пиццы */
    public String getName() {
        return getClass().getSimpleName();
    }

    /** Получить цену пиццы, состоящую из цены за тесто, соус и индредиентов */
    public double getCost() {
        return dough.getCost() + sauce.getCost() + getIngredientCost();
    }

    /** Получить цену за ингредиенты пиццы */
    private double getIngredientCost() {
        double totalPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getCost();
        }

        return totalPrice;
    }

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

    protected abstract  List<Ingredient> getDefaultIngredients();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return dough == pizza.dough && sauce == pizza.sauce && Objects.equals(ingredients, pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dough, sauce, ingredients);
    }
}
