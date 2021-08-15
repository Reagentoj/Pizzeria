package ru.pizza.models;

/**
 * Базовый класс модели человека
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Person {

    private final long id; /** Поле уникальный идентификатор */
    private final String name; /** Поле имя */
    private int age; /** Поле возраст */

    /**
     * Констурктор класса Person
     * @param id уникальный идентификатор
     * @param name имя
     * @param age возраст
     */
    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /** Получить значение поля id */
    public long getId() {
        return id;
    }

    /** Получить значение поля name */
    public String getName() {
        return name;
    }

    /** Получить значение поля age */
    public int getAge() {
        return age;
    }
}
