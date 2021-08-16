package ru.pizza.repository.data;

import ru.pizza.models.Order;
import ru.pizza.models.Pizza;
import ru.pizza.models.Seller;

import java.util.ArrayList;
import java.util.List;

import ru.pizza.strings.StringsSource;


public class PizzaDataSourceImpl implements PizzaDataSource {

    private final List<Pizza> pizzas = new ArrayList<>();
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    public PizzaDataSourceImpl() {
        initData();
    }

    private void initData() {

        pizzas.add(new Pizza(1, StringsSource.pizzaMargarita, StringsSource.costMargarita, null, null));
        pizzas.add(new Pizza(2, StringsSource.pizzaPepperoni, StringsSource.costPepperoni,
                new String[]{StringsSource.ingredientJalapeno, StringsSource.ingredientParmesan},
                new double[]{StringsSource.ingredientJalapenoCost, StringsSource.ingredientParmesanCost}));
        pizzas.add(new Pizza(3, StringsSource.pizzaMushroom, StringsSource.costMushroom, null, null));
        pizzas.add(new Pizza(4, StringsSource.pizzaCarbonara, StringsSource.costCarbonara,
                new String[]{StringsSource.ingredientTomatoes, StringsSource.ingredientCapers, StringsSource.ingredientChilli},
                new double[]{StringsSource.ingredientTomatoesCost, StringsSource.ingredientCapersCost, StringsSource.ingredientChilliCost}));
        pizzas.add(new Pizza(5, StringsSource.pizzaFourCheese, StringsSource.costFourCheese,
                new String[]{StringsSource.ingredientOlives, StringsSource.ingredientJalapeno, StringsSource.ingredientCapers},
                new double[]{StringsSource.ingredientOlivesCost, StringsSource.ingredientJalapenoCost, StringsSource.ingredientCapersCost}));
        pizzas.add(new Pizza(6, StringsSource.pizzaMargarita, StringsSource.costMargarita, null, null));
        pizzas.add(new Pizza(7, StringsSource.pizzaFourCheese, StringsSource.costFourCheese, null, null));
        pizzas.add(new Pizza(8, StringsSource.pizzaCarbonara, StringsSource.costCarbonara, null, null));

        sellers.add(new Seller(StringsSource.sellerOlegId, StringsSource.sellerOlegName, StringsSource.sellerOlegAge));
        sellers.add(new Seller(StringsSource.sellerAlexId, StringsSource.sellerAlexName, StringsSource.sellerAlexAge));

        orders.add(new Order(101, StringsSource.sellerOlegId, new long[]{1,2,3}));
        orders.add(new Order(102, StringsSource.sellerAlexId, new long[]{4,5}));
        orders.add(new Order(103, StringsSource.sellerAlexId, new long[]{6}));
        orders.add(new Order(104, StringsSource.sellerAlexId, new long[]{7,8}));
    }

    @Override
    public List<Pizza> getPizzas() {
        return null;
    }

    @Override
    public List<Seller> getSellers() {
        return null;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
