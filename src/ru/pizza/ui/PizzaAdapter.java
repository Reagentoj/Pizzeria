package ru.pizza.ui;

import ru.pizza.repository.PizzaRepository;
import ru.pizza.repository.data.PizzaDataSource;

public class PizzaAdapter {
    private final PizzaRepository repository;
    private final PizzaDataSource pizzaDataSource;

    public PizzaAdapter(PizzaRepository repository, PizzaDataSource pizzaDataSource) {
        this.repository = repository;
        this.pizzaDataSource = pizzaDataSource;
    }

    public void show() {
        String getIngredientsCostInOrder = String.format("Стоимость ингредиентов заказа %.2f", repository.getIngredientsCostInOrder(1030));
        System.out.println(getIngredientsCostInOrder);
        String getAmountSalesOfPizza = String.format("Общее количество проданныъ пицц %d", repository.getAmountSalesOfPizza());
        System.out.println(getAmountSalesOfPizza);
        String getSellerWithMostSells = String.format("Лучший продавец %s", repository.getSellerWithMostSells());
        System.out.println(getSellerWithMostSells);
        String getOldestSeller = String.format("Старший по возрасту продавец %s", repository.getOldestSeller());
        System.out.println(getOldestSeller);
        String getOrderIdWithMoreThanAmountPizzas = "Номера заказов в котором более чем 3 пиццы " + repository.getOrderIdWithMoreThanAmountPizzas(3);
        System.out.println(getOrderIdWithMoreThanAmountPizzas);
    }
}
