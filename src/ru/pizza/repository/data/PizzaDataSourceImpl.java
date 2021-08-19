package ru.pizza.repository.data;

import ru.pizza.models.*;

import java.util.ArrayList;
import java.util.List;

import ru.pizza.strings.StringsSource;


public class PizzaDataSourceImpl implements PizzaDataSource {

    private final List<Pizza> pizzas = new ArrayList<>();
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    private void initData() {

        pizzas.add(new Margarita(Dough.Thick, Sauce.Cheese));
    }

    @Override
    public List<Pizza> getPizzas() {
        return null;
    }

    @Override
    public List<Seller> getSellers() {
        return null;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
