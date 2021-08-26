package ru.pizza.models.pizzas;

import ru.pizza.models.*;
import java.util.Arrays;


public class Mushroom extends Pizza {

    public Mushroom(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.MushroomId;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Tomatoes, Ingredient.Mozzarella, Ingredient.Mushrooms, Ingredient.OliveOil));
    }
}
