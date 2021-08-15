package ru.pizza.models;

/**
 * Дата класс Заказы
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Order {
    private final long id; /** уникальный идентификатор заказа */
    private final long sellerId; /** уникальный идентификатор продавца */
    private final Pizza[] pizzas; /** названия заказанных пиц */
    private final double cost; /** стоимость заказа */

    /**
     * Конструктор класса Order
     * @param id уникальный идентификатор заказа
     * @param sellerId уникальный идентификатор продавца
     * @param pizzas название заказанных пиц
     * @param cost стоимость заказа
     */
    public Order(long id, long sellerId, Pizza[] pizzas, double cost) {
        this.id = id;
        this.sellerId = sellerId;
        this.pizzas = pizzas;
        this.cost = cost;
    }

    /** Получить значение поля id */
    public long getId() {
        return id;
    }

    /** Получить значение поля sellerId */
    public  long getSellerId() {
        return sellerId;
    }

    /** Получить значение поля pizzas */
    public Pizza[] getPizzas() {
        return pizzas;
    }

    /** Получить значение поля cost */
    public double getCost() {
        return cost;
    }
}
