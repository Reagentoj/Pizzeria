package ru.pizza.models;

/**
 * Базовый класс модели Pizza
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Pizza {

    private final long id; /** Уникальный идентификатор */
    private final String name; /** Поле название */
    private final double cost; /** Поле стоимость */
    private final String[] ingredients; /** Поле ингредиенты */
    private final double[] ingredientsCost; /** Цены на ингредиенты */

    /**
     * Конструктор класса Pizza
     * @param id уникальный идентификатор
     * @param name название пиццы
     * @param cost стоимость пиццы
     * @param ingredients ингредиенты
     * @param ingredientsCost Цены на ингредиенты
     */
    public Pizza(long id, String name, double cost, String[] ingredients, double[] ingredientsCost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
        this.ingredientsCost = ingredientsCost;
    }

    /** Получить значение поля id */
    public long getId() {
        return id;
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

    /** Получить значение поля ingredientsCost */
    public double[] getIngredientsCost() {
        return ingredientsCost;
    }
}