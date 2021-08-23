package ru.pizza.repository.data;

import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;
import ru.pizza.models.pizzas.Margarita;

import java.util.List;

public interface PizzaDataSource {
    List<Seller> getSellers();
    List<Order> getOrders();
}
