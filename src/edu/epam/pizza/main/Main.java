package edu.epam.pizza.main;

import edu.epam.pizza.entity.Ingredients;
import edu.epam.pizza.entity.Order;
import edu.epam.pizza.entity.Pizza;
import edu.epam.pizza.entity.Type;

public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(7717);

        Pizza margarita = new Pizza("margarita", Type.CALZONE,2,order1);
        margarita.addIngredients(Ingredients.TomatoPaste);
        margarita.addIngredients(Ingredients.Pepper);
        margarita.addIngredients(Ingredients.Garlic);
        margarita.addIngredients(Ingredients.Bacon);

        Pizza pep = new Pizza("Peperoni", Type.DEFAULT,3,order1);
        pep.addIngredients(Ingredients.TomatoPaste);
        pep.addIngredients(Ingredients.Cheese);
        pep.addIngredients(Ingredients.Pepperoni);
        pep.addIngredients(Ingredients.Olives);
        order1.addPizza(margarita);
        order1.addPizza(pep);

        System.out.println(order1.toString());

        Order order2 = new Order(7718);
        Pizza pep2 = new Pizza("Pe", Type.DEFAULT,11,order2);
        pep2.addIngredients(Ingredients.TomatoPaste);
        pep2.addIngredients(Ingredients.Cheese);
        order2.addPizza(pep2);
        System.out.println(order2.toString());
    }
}
