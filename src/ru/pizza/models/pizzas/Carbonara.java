package ru.pizza.models.pizzas;

import ru.pizza.models.*;
import java.util.Arrays;
import java.util.List;


public class Carbonara extends Pizza {

    public Carbonara(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.CarbonaraId;
    }

    @Override
    protected List<Ingredient> getDefaultIngredients() {
        return null;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Capers, Ingredient.Parmesan,
                        Ingredient.Ham, Ingredient.Oregano, Ingredient.OliveOil));
    }
}
