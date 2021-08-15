package ru.pizza.repository.data;

import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;

import java.util.List;

public interface PizzaDataSource {
    List<Pizza> getPizzas();
    List<Seller> getSellers();
    List<Order> getOrders();
}
