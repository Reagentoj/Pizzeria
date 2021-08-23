package ru.pizza.repository;


import ru.pizza.models.Order;
import ru.pizza.models.Seller;

import java.util.List;

public interface PizzaRepository {
    /** Получить стоимость ингредиентов в заказе
     * @return стоимость ингредиентов пиццы */
    double getIngredientsCostInOrder(long OrderId);
    /** получить количество проданных пицц */
    int getAmountSalesOfPizza();
    /** Получить продавца с наибольшим количеством продаж */
    String getSellerWithMostSells();
    /** Получить старшего продавца  */
    String getOldestSeller();
    /** Получить заказ в котором более двух пицц */
    List<Long> getOrderIdWithMoreThanAmountPizzas(int amount);
}
