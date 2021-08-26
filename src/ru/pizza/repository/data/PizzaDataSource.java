package ru.pizza.repository.data;

import ru.pizza.models.Order;
import ru.pizza.models.Seller;
import java.util.List;


public interface PizzaDataSource {
    List<Seller> getSellers();
    List<Order> getOrders();
}
