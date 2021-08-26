package ru.pizza.models;

import java.util.List;


public class Util {
    public static <T> boolean isNotEmpty(List<T> list) {
        return list != null && !list.isEmpty();
    }
}
