package ru.pizza.models.pizzas;

import ru.pizza.models.*;
import java.util.Arrays;


public class Carbonara extends Pizza {

    public Carbonara(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.CarbonaraId;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Capers, Ingredient.Parmesan,
                        Ingredient.Ham, Ingredient.Oregano, Ingredient.OliveOil));
    }
}
