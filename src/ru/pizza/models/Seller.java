package ru.pizza.models;

import java.util.Objects;

/**
 * Класс продавец
 * @author Kantemir Tatarkanov 10.08.2021
 */
public class Seller {

    private final long id; /** Поле уникальный идентификатор */
    private final String name; /** Поле имя */
    private int age; /** Поле возраст */

    /**
     * Констурктор класса Person
     * @param id уникальный идентификатор
     * @param name имя
     * @param age возраст
     */
    public Seller(long id, String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return id == seller.id && age == seller.age && Objects.equals(name, seller.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
