package ru.pizza.ui;

import ru.pizza.models.Dough;
import ru.pizza.models.Ingredient;
import ru.pizza.models.pizzas.Margarita;
import ru.pizza.models.Sauce;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Margarita margarita = new Margarita(Dough.Thick, Sauce.Cheese);
        margarita.addIngredients(Arrays.asList(Ingredient.Chilli, Ingredient.Capers));
        System.out.println(margarita.getName());
    }
}
