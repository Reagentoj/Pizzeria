package ru.pizza.test;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.pizza.models.*;
import ru.pizza.repository.PizzaRepository;
import ru.pizza.repository.PizzaRepositoryImpl;
import ru.pizza.repository.data.PizzaDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PizzaRepositoryImplTest {
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();
    PizzaDataSource dataSource;
    PizzaRepository pizzaRepository;

    @BeforeEach
    private void setUp() {
        dataSource = Mockito.mock(PizzaDataSource.class);
        pizzaRepository = new PizzaRepositoryImpl(dataSource);
        initTestData();

        Mockito.when(dataSource.getOrders()).thenReturn(orders);
        Mockito.when(dataSource.getSellers()).thenReturn(sellers);
    }

    @Test
    public void getIngredientsCostsInOrder() {
        long orderId = 3;
        Assert.assertEquals(pizzaRepository.getIngredientsCostInOrder(orderId),);
        pizzaRepository.getIngredientsCostInOrder(orderId);
    }

//    @Test
//    public void getAmountSalesOfPizza() {
//
//    }
//
//    @Test
//    public void getSellerWithMostSells() {
//
//    }
//
//    @Test
//    public void getOldestSeller() {
//
//    }
//
//    @Test
//    public void getOrderIdWithMoreThanAmountPizzas() {
//
//    }

    private void initTestData() {
        sellers.add(new Seller(10, "Vasya", 20));
        sellers.add(new Seller(11, "Oleg", 29));
        sellers.add(new Seller(12, "Nastya", 23));
        orders.add(new Order(1, 10,
                Arrays.asList(PizzaMaker.createDefaultPepperoni(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Capers, Ingredient.Gorgonzola)))));
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
