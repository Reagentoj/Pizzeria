package ru.pizza.models.pizzas;


import ru.pizza.models.*;
import java.util.Arrays;
import java.util.List;


public class Margarita extends Pizza {

    public Margarita(Dough dough, Sauce sauce) {
        super(dough, sauce);
    }

    @Override
    public long getId() {
        return Ids.MargaritaId;
    }

    @Override
    protected List<Ingredient> getDefaultIngredients() {

        return Arrays.asList(Ingredient.Tomatoes, Ingredient.Mozzarella, Ingredient.OliveOil);
    }

    @Override
    protected void createDefaultPizza() {
        ingredients.addAll(getDefaultIngredients());
    }
}
