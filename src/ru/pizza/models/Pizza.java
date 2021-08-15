package ru.pizza.models;

/**
 * Базовый класс модели Pizza
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Pizza {

    private final String name; /** Поле название */
    private final double cost; /** Поле стоимость */
    private String[] ingredients; /** Поле ингредиенты */
    private String pizzaType; /** Поле вид пиццы */

    /**
     * Конструктор класса Pizza
     * @param name название пиццы
     * @param cost стоимость пиццы
     * @param ingredients ингредиенты
     * @param pizzaType вид пиццы
     */
    public Pizza(String name, double cost, String[] ingredients, String pizzaType) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
        this.pizzaType = pizzaType;
    }

    /** Получить значение поля name */
    public String getName() {
        return name;
    }

    /** Получить значение поля cost */
    public double getCost() {
        return cost;
    }

    /** Получить значение поля ingredients */
    public String[] getIngredients() {
        return ingredients;
    }

    /** Получить значение поля pizzaType */
    public String getPizzaType() {
        return pizzaType;
    }
}