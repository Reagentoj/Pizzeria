package ru.pizza.repository.data;

import ru.pizza.models.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PizzaDataSourceImpl implements PizzaDataSource {
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    public PizzaDataSourceImpl() {
        initData();
    }

    private void initData() {

        sellers.add(new Seller(101, "Олег Сырный", 24));
        sellers.add(new Seller(102, "Анжелика Томатная", 26));
        sellers.add(new Seller(103, "Джони Халапеньо", 43));
        sellers.add(new Seller(104, "Антонио Маргаретти", 35));

        orders.add(new Order(1010, 101, Arrays.asList(
                PizzaMaker.createDefaultMargarita(Dough.Thin, Sauce.Cheese,
                        Arrays.asList(Ingredient.Emmental, Ingredient.Gorgonzola))
        )));
        orders.add(new Order(1020, 102, Arrays.asList(
                PizzaMaker.createDefaultPepperoni(Dough.Thin, Sauce.Tomato, null))
        ));
        orders.add(new Order(1030, 103, Arrays.asList(
                PizzaMaker.createDefaultMargarita(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Ham, Ingredient.Chilli, Ingredient.Jalapeno)),
                PizzaMaker.createDefaultFourCheese(Dough.Thin, Sauce.Tomato,
                        Arrays.asList(Ingredient.Chilli, Ingredient.Jalapeno)),
                PizzaMaker.createDefaultMushroom(Dough.Thick, Sauce.Tomato, null)
        )));
        orders.add(new Order(1040, 104, Arrays.asList(
                PizzaMaker.createDefaultCarbonara(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Olives, Ingredient.Oregano, Ingredient.Tomatoes))
        )));
        orders.add(new Order(1050, 104, Arrays.asList(
                PizzaMaker.createDefaultPepperoni(Dough.Thin, Sauce.Cheese,
                        Arrays.asList(Ingredient.Tomatoes, Ingredient.Ham, Ingredient.Jalapeno,
                                Ingredient.Emmental, Ingredient.Mozzarella, Ingredient.Olives))
        )));
        orders.add(new Order(1060, 103, Arrays.asList(
                PizzaMaker.createDefaultMargarita(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Olives, Ingredient.Jalapeno)),
                PizzaMaker.createDefaultCarbonara(Dough.Thin, Sauce.Tomato,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Ham, Ingredient.Jalapeno, Ingredient.Oregano)),
                PizzaMaker.createDefaultMushroom(Dough.Thin, Sauce.Cheese,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Oregano, Ingredient.Mozzarella, Ingredient.Capers, Ingredient.OliveOil)),
                PizzaMaker.createDefaultFourCheese(Dough.Thick, Sauce.Cheese,
                        Arrays.asList(Ingredient.Jalapeno, Ingredient.Chilli, Ingredient.Capers, Ingredient.Mushrooms)),
                PizzaMaker.createDefaultPepperoni(Dough.Thick, Sauce.Tomato,
                        Arrays.asList(Ingredient.Ham, Ingredient.Olives, Ingredient.Jalapeno,
                                Ingredient.Oregano, Ingredient.Capers, Ingredient.Mozzarella))
        )));
        orders.add(new Order(1070, 101, Arrays.asList(
                PizzaMaker.createDefaultCarbonara(Dough.Thin, Sauce.Tomato, null)
        )));
    }
    @Override
    public List<Seller> getSellers() {
        return sellers;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}
