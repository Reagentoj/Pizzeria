package ru.pizza.models;

import java.util.List;

/**
 * Класс Заказы
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Order {
    private final long id; /** уникальный идентификатор заказа */
    private final long sellerId; /** уникальный идентификатор продавца */
    private final List<Pizza> pizzas; /** названия заказанных пиц */

    /**
     * Конструктор класса Order
     * @param id уникальный идентификатор заказа
     * @param sellerId уникальный идентификатор продавца
     * @param pizzas название заказанных пиц
     */
    public Order(long id, long sellerId, List<Pizza> pizzas) {
        this.id = id;
        this.sellerId = sellerId;
        this.pizzas = pizzas;
    }

    /** Получить значение поля id */
    public long getId() {
        return id;
    }

    /** Получить значение поля sellerId */
    public  long getSellerId() {
        return sellerId;
    }

    /** Получить список пицц */
    public List<Pizza> getPizzas() {
        return pizzas;
    }

}
