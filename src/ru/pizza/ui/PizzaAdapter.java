package ru.pizza.ui;

import ru.pizza.repository.PizzaRepository;
import ru.pizza.repository.data.PizzaDataSource;

public class PizzaAdapter {
    private final PizzaRepository repository;
    private final PizzaDataSource pizzaDataSource;

    public PizzaAdapter(PizzaRepository repository, PizzaDataSource pizzaDataSource) {
        this.repository = repository;
        this.pizzaDataSource = pizzaDataSource;
    }

    public void show() {
    }
}
