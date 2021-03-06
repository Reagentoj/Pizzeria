package ru.pizza.models.pizzas;

import ru.pizza.models.*;
import java.util.Arrays;
import java.util.List;


public class Pepperoni extends Pizza {

    public Pepperoni(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.PepperoniId;
    }

    @Override
    protected List<Ingredient> getDefaultIngredients() {
        return null;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Parmesan, Ingredient.Mozzarella, Ingredient.Oregano, Ingredient.OliveOil));
    }
}
