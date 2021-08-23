package ru.pizza.ui;

import ru.pizza.repository.PizzaRepository;
import ru.pizza.repository.PizzaRepositoryImpl;
import ru.pizza.repository.data.PizzaDataSource;
import ru.pizza.repository.data.PizzaDataSourceImpl;

public class Main {

    public static void main(String[] args) {
        PizzaDataSource pizzaDataSource = new PizzaDataSourceImpl();
        PizzaRepository pizzaRepository = new PizzaRepositoryImpl(pizzaDataSource);
        PizzaAdapter adapter = new PizzaAdapter(pizzaRepository, pizzaDataSource);
        adapter.show();
    }
}
