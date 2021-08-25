package ru.pizza.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import ru.pizza.models.*;
import ru.pizza.repository.PizzaRepository;
import ru.pizza.repository.PizzaRepositoryImpl;
import ru.pizza.repository.data.PizzaDataSource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaRepositoryImplTest {
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();
    private final List<Ingredient> ingredients = new ArrayList<>();
    PizzaDataSource dataSource;
    PizzaRepository pizzaRepository;

    @BeforeEach
    public void setUp() {
        dataSource = Mockito.mock(PizzaDataSource.class);
        pizzaRepository = new PizzaRepositoryImpl(dataSource);
        initTestData();

        Mockito.when(dataSource.getOrders()).thenReturn(orders);
        Mockito.when(dataSource.getSellers()).thenReturn(sellers);
    }

    @Test
    void getIngredientsCostInOrder() {
        long orderId = 1;
        double ingredientCost = Ingredient.Capers.getCost();
        assertEquals(pizzaRepository.getIngredientsCostInOrder(orderId), ingredientCost, 0.1);
    }

    @Test
    void getAmountSalesOfPizza() {
    }

    @Test
    void getSellerWithMostSells() {
        String sellerName = "Oleg";
        assertEquals(pizzaRepository.getSellerWithMostSells(), sellerName);
    }

    @Test
    void getOldestSeller() {
    }

    @Test
    void getOrderIdWithMoreThanAmountPizzas() {
    }

    private void initTestData() {
        sellers.add(new Seller(10, "Vasya", 20));
        sellers.add(new Seller(11, "Oleg", 29));
        sellers.add(new Seller(12, "Nastya", 23));
        orders.add(new Order(1, 10,
                Arrays.asList(PizzaMaker.createDefaultPepperoni(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Capers)))));
        orders.add(new Order(2, 11,
                Arrays.asList(PizzaMaker.createDefaultMargarita(Dough.Thin, Sauce.Cheese,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Olives, Ingredient.Tomatoes, Ingredient.Mushrooms)))));
        orders.add(new Order(3, 12,
                Arrays.asList(PizzaMaker.createDefaultCarbonara(Dough.Thick, Sauce.Tomato,
                        Arrays.asList(Ingredient.Mushrooms, Ingredient.Oregano, Ingredient.Ham, Ingredient.Chilli)))));
        orders.add(new Order(4, 11,
                Arrays.asList(PizzaMaker.createDefaultFourCheese(Dough.Thin, Sauce.Tomato,
                        Arrays.asList(Ingredient.Chilli, Ingredient.Jalapeno, Ingredient.Mozzarella)))));
        orders.add(new Order(5, 11,
                Arrays.asList(PizzaMaker.createDefaultPepperoni(Dough.Thin, Sauce.Cheese, null))));
    }
}