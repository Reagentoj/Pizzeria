package ru.pizza.repository;

import ru.pizza.models.Ingredient;
import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;
import ru.pizza.repository.data.PizzaDataSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzaRepositoryImpl implements PizzaRepository {
    private final PizzaDataSource dataSource;

    public PizzaRepositoryImpl(PizzaDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /** Получить стоимость ингредиентов в заказе
     * @return стоимость ингредиентов пиццы */
    @Override
    public double getIngredientsCostInOrder(long id) {
        List<Order> orders = dataSource.getOrders();
        double getIngredientsCost = 0.0;
        if (!dataSource.getOrders().isEmpty()) {
            for (Order order : orders) {
                List<Pizza> orderPizzas = order.getPizzas();
                for (Pizza pizza : orderPizzas) {
                    getIngredientsCost = pizza.getIngredientCost();
                }
            }
        }

        return getIngredientsCost;
    }

    /** получить количество проданных пицц */
    @Override
    public int getCountSalesOfPizza() {
        List<Order> orders = dataSource.getOrders();
        int countOfPizzas = 0;
        if(!dataSource.getOrders().isEmpty()) {
            for (Order order : orders) {
                List<Pizza> pizzas = order.getPizzas();
                countOfPizzas = pizzas.size();
            }
        }
        return countOfPizzas;
    }

    /**  Получить продавца с наибольшим количеством продаж */
    @Override
    public String getSellerWithMostSells() {
        List<Seller> sellers = dataSource.getSellers();
        Map<Long, Integer> countOfSales = new HashMap<>();
        String bestSellerName = null;
        int countOfSell = 0;
        long bestSellerId = 0;

        if (!dataSource.getOrders().isEmpty()) {
            for (Seller seller : sellers) {
                for (Order order : dataSource.getOrders()) {
                    if (seller.getId() == order.getSellerId()) {
                        countOfSell++;
                    }
                    countOfSell = 0;
                }
            }
            for (Seller seller : sellers) {
                if (bestSellerId == seller.getId()) {
                    bestSellerName = seller.getName();
                }
            }
        }

        return bestSellerName;
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
