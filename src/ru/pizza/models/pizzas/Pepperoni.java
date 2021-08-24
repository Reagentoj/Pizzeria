package ru.pizza.models.pizzas;

import ru.pizza.models.*;

import java.util.Arrays;

public class Pepperoni extends Pizza {

    public Pepperoni(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.PepperoniId;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Parmesan, Ingredient.Mozzarella, Ingredient.Oregano, Ingredient.OliveOil));
    }
}
