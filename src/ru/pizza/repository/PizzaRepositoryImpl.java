package ru.pizza.repository;

import ru.pizza.models.Ingredient;
import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;
import ru.pizza.repository.data.PizzaDataSource;
import java.util.*;


public class PizzaRepositoryImpl implements PizzaRepository {
    private final PizzaDataSource dataSource;

    public PizzaRepositoryImpl(PizzaDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /** Получить стоимость ингредиентов в заказе
     * @return стоимость ингредиентов пиццы */
    @Override
    public double getIngredientsCostInOrder(long orderId) {
        List<Order> orders = dataSource.getOrders();
        double getIngredientsCost = 0.0;
        boolean addingIngredientsSwitch = false;

        if (!dataSource.getOrders().isEmpty()) {
            for (Order order : orders) {
                if (order.getId() == orderId) {
                    List<Pizza> orderPizzas = order.getPizzas();
                    for (Pizza pizza : orderPizzas) {
                        List<Ingredient> ingredients = pizza.getIngredients();
                        for (Ingredient ingredient : ingredients) {
                            if (addingIngredientsSwitch) {
                                getIngredientsCost += ingredient.getCost();
                            } else if (ingredient.name().equals(Ingredient.OliveOil.name())) {
                                addingIngredientsSwitch = true;
                            }
                        }
                        addingIngredientsSwitch = false;
                    }
                }
            }
        }

        return getIngredientsCost;
    }


    /** получить количество проданных пицц */
    @Override
    public int getAmountSalesOfPizza() {
        List<Order> orders = dataSource.getOrders();
        int amountOfPizzas = 0;
        if(!dataSource.getOrders().isEmpty()) {
            for (Order order : orders) {
                List<Pizza> pizzas = order.getPizzas();
                amountOfPizzas += pizzas.size();
            }
        }

        return amountOfPizzas;
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
                    countOfSales.put(seller.getId(), countOfSell);
                }
                countOfSell = 0;
            }
            for (Map.Entry<Long, Integer> pair : countOfSales.entrySet()) {                     // заменить Long на Seller
                if (Objects.equals(pair.getValue(), Collections.max(countOfSales.values()))) {
                    bestSellerId = pair.getKey();
                }
                for (Seller seller : sellers) {
                    if (bestSellerId == seller.getId()) {
                        bestSellerName = seller.getName();
                    }
                }
            }
        }

        return bestSellerName;                                                                  // вернуть объект Seller
    }

                                                                                                 // добавить метод лучший продавец по сумме проданного

    /** Получить старшего продавца */
    @Override
    public String getOldestSeller() {                                                            // заменить String на Seller
        List<Seller> sellers = dataSource.getSellers();
        Map<Long, Integer> sellersIdAndOld = new HashMap<>();
        long oldestSellerId = 0;
        String oldestSellerName = null;

        if (!dataSource.getSellers().isEmpty()) {
            for (Seller seller : dataSource.getSellers()) {
                sellersIdAndOld.put(seller.getId(), seller.getAge());
            }
            for (Map.Entry<Long, Integer> pair : sellersIdAndOld.entrySet()) {                  // заменить Long на Seller
                if (Objects.equals(pair.getValue(), Collections.max(sellersIdAndOld.values()))) {
                    oldestSellerId = pair.getKey();
                }
                for (Seller seller : sellers) {
                    if (seller.getId() == oldestSellerId) {
                        oldestSellerName = seller.getName();
                    }
                }
            }
        }

        return oldestSellerName;                                                                 // вернуть объект Seller
    }

    /** Получить заказы в котором более чем amount пицц */
    @Override
    public List<Long> getOrderIdWithMoreThanAmountPizzas(int amount) {                          // Добавить Дату (диапазон в 2 месяца)
        List<Order> orders = dataSource.getOrders();
        List<Long> orderIds = new ArrayList<>();

        if (!dataSource.getOrders().isEmpty()) {
            for (Order order : orders) {
                if (order.getPizzas().size() >= amount) {
                    orderIds.add(order.getId());
                }
            }
        }

        return orderIds;
    }
}
