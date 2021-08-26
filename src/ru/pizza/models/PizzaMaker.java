package ru.pizza.models;

import ru.pizza.models.pizzas.*;
import java.util.List;


public class PizzaMaker {
    public static Margarita createDefaultMargarita(Dough dough, Sauce sauce, List<Ingredient> additionalIngredients) {
        Margarita margarita = new Margarita(dough, sauce);
        if (Util.isNotEmpty(additionalIngredients)) {
            margarita.addIngredients(additionalIngredients);
        }
        return margarita;
    }
    public static Pepperoni createDefaultPepperoni(Dough dough, Sauce sauce, List<Ingredient> additionalIngredients) {
        Pepperoni pepperoni = new Pepperoni(dough, sauce);
        if (Util.isNotEmpty(additionalIngredients)) {
            pepperoni.addIngredients(additionalIngredients);
        }
        return pepperoni;
    }
    public static Mushroom createDefaultMushroom(Dough dough, Sauce sauce, List<Ingredient> additionalIngredients) {
        Mushroom mushroom = new Mushroom(dough, sauce);
        if (Util.isNotEmpty(additionalIngredients)) {
            mushroom.addIngredients(additionalIngredients);
        }
        return mushroom;
    }
    public static Carbonara createDefaultCarbonara(Dough dough, Sauce sauce, List<Ingredient> additionalIngredients) {
        Carbonara carbonara = new Carbonara(dough, sauce);
        if (Util.isNotEmpty(additionalIngredients)) {
            carbonara.addIngredients(additionalIngredients);
        }
        return carbonara;
    }
    public static FourCheese createDefaultFourCheese(Dough dough, Sauce sauce, List<Ingredient> additionalIngredients) {
        FourCheese fourCheese = new FourCheese(dough, sauce);
        if (Util.isNotEmpty(additionalIngredients)) {
            fourCheese.addIngredients(additionalIngredients);
        }
        return fourCheese;
    }

}
