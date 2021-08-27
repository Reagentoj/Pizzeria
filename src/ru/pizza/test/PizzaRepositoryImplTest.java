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
    private PizzaDataSource dataSource;
    private PizzaRepository pizzaRepository;

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
        double ingredientCost = Ingredient.Capers.getCost() + Ingredient.Capers.getCost()
                + Ingredient.Oregano.getCost() + Ingredient.OliveOil.getCost();
        assertEquals(pizzaRepository.getIngredientsCostInOrder(orderId), ingredientCost);
    }

    @Test
    void getAmountSalesOfPizza() {
        int amount = 6;
        assertEquals(pizzaRepository.getAmountSalesOfPizza(), amount);
    }

    @Test
    void getSellerWithMostSells() {
        String sellerName = "Nastya";
        assertEquals(pizzaRepository.getSellerWithMostSells(), sellerName);
    }

    @Test
    void getOldestSeller() {
        String sellerName = "Oleg";
        assertEquals(pizzaRepository.getOldestSeller(), sellerName);
    }

    @Test
    void getOrderIdWithMoreThanAmountPizzas() {
        String listOfOrdersIds = "[1, 2, 3, 4, 5]";
        assertEquals(pizzaRepository.getOrderIdWithMoreThanAmountPizzas(1).toString(), listOfOrdersIds);
    }

    private void initTestData() {
        sellers.add(new Seller(10, "Vasya", 20));
        sellers.add(new Seller(11, "Oleg", 29));
        sellers.add(new Seller(12, "Nastya", 23));
        orders.add(new Order(1, 10,
                Arrays.asList(
                        PizzaMaker.createPepperoni(Dough.Thick, Sauce.Cheese,
                                Arrays.asList(Ingredient.Capers)),
                        PizzaMaker.createMargarita(Dough.Thin, Sauce.Cheese,
                                Arrays.asList(Ingredient.Capers, Ingredient.Oregano, Ingredient.OliveOil)))));
        orders.add(new Order(2, 12,
                Arrays.asList(PizzaMaker.createMargarita(Dough.Thin, Sauce.Cheese,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Olives, Ingredient.Tomatoes, Ingredient.Mushrooms)))));
        orders.add(new Order(3, 12,
                Arrays.asList(PizzaMaker.createCarbonara(Dough.Thick, Sauce.Tomato,
                        Arrays.asList(Ingredient.Mushrooms, Ingredient.Oregano, Ingredient.Ham, Ingredient.Chilli)))));
        orders.add(new Order(4, 12,
                Arrays.asList(PizzaMaker.createFourCheese(Dough.Thin, Sauce.Tomato,
                        Arrays.asList(Ingredient.Chilli, Ingredient.Jalapeno, Ingredient.Mozzarella)))));
        orders.add(new Order(5, 11,
                Arrays.asList(PizzaMaker.createPepperoni(Dough.Thin, Sauce.Cheese, null))));
    }
}