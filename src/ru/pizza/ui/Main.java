package ru.pizza.ui;

import ru.pizza.models.*;
import ru.pizza.models.pizzas.Margarita;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1080, 1,
                Arrays.asList(PizzaMaker.createDefaultCarbonara(Dough.Thin, Sauce.Tomato,
                        Arrays.asList(Ingredient.Mozzarella, Ingredient.Oregano)),
                        PizzaMaker.createDefaultMargarita(Dough.Thin, Sauce.Cheese, null)));

        Margarita margarita = new Margarita(Dough.Thick, Sauce.Cheese);
        margarita.addIngredients(Arrays.asList(Ingredient.Chilli, Ingredient.Capers));


        for (Pizza pizza : order.getPizzas()) {
            System.out.println(pizza.getName());
        }

        System.out.println(order.getPizzas().get(0).getName());
    }
}
