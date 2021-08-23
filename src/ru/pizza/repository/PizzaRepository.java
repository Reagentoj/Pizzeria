package ru.pizza.repository;


import ru.pizza.models.Ingredient;
import ru.pizza.models.Order;
import ru.pizza.models.Seller;

public interface PizzaRepository {
    /** Получить стоимость ингредиентов в заказе */
    Ingredient getIngredientsCostInOrder(long id);
    /** получить количество проданных пицц */
    Order getCountSalesOfPizza();
    /** Получить продавца с наибольшим количеством продаж */
    Seller getSellerWithMostSells();
    /** Получить старшего продавца  */
    Seller getOldestSeller();
    /** Получить заказ в котором более двух пицц */
    Order getOrderWithMoreThanTwoPizzas();
}
