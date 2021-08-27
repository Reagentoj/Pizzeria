package ru.pizza.models.pizzas;

import ru.pizza.models.*;
import java.util.Arrays;
import java.util.List;


public class FourCheese extends Pizza {

    public FourCheese(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.FourCheeseId;
    }

    @Override
    protected List<Ingredient> getDefaultIngredients() {
        return null;
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(
                Arrays.asList(Ingredient.Parmesan, Ingredient.Mozzarella, Ingredient.Emmental,
                        Ingredient.Gorgonzola, Ingredient.Oregano, Ingredient.OliveOil));
    }
}
