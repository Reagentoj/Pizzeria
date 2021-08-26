package ru.pizza.repository;

import java.util.List;


public interface PizzaRepository {
    /** Получить стоимость ингредиентов в заказе
     * @return стоимость ингредиентов пиццы */
    double getIngredientsCostInOrder(long OrderId);
    /** Получить количество проданных пицц */
    int getAmountSalesOfPizza();
    /** Получить продавца с наибольшим количеством продаж */
    String getSellerWithMostSells();
    /** Получить старшего продавца  */
    String getOldestSeller();
    /** Получить заказ в котором более двух пицц */
    List<Long> getOrderIdWithMoreThanAmountPizzas(int amount);
}
