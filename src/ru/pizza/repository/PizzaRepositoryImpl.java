package ru.pizza.repository;

import ru.pizza.models.Ingredient;
import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;
import ru.pizza.repository.data.PizzaDataSource;

import java.util.ArrayList;
import java.util.List;

public class PizzaRepositoryImpl implements PizzaRepository {
    private final PizzaDataSource dataSource;

    public PizzaRepositoryImpl(PizzaDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /** Получить стоимость ингредиентов в заказе */
    @Override
    public Ingredient getIngredientsCostInOrder(long id) {
        List<Order> orders = dataSource.getOrders();
        if (!dataSource.getOrders().isEmpty()) {
            for () {

            }
        }

        return null;
    }

    /** получить количество проданных пицц */
    @Override
    public Order getCountSalesOfPizza() {
        return null;
    }

    /**  Получить продавца с наибольшим количеством продаж */
    @Override
    public Seller getSellerWithMostSells() {
        return null;
    }

    /** Получить старшего продавца */
    @Override
    public Seller getOldestSeller() {
        return null;
    }

    /** Получить заказ в котором более двух пицц */
    @Override
    public Order getOrderWithMoreThanTwoPizzas() {
        return null;
    }
}
