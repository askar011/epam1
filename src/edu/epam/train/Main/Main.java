package edu.epam.train.Main;

public class Main {

    public static void main(String[] args) {
        Order or = new Order(7717);
        Pizza margarita = new Pizza("margaritagarita", Type.CALZONE,2,7717);
        margarita.addIngredients(Ingredients.TomatoPaste);
        margarita.addIngredients(Ingredients.Pepper);
        margarita.addIngredients(Ingredients.Garlic);
        margarita.addIngredients(Ingredients.Bacon);
        Pizza pep = new Pizza("Peperoni", Type.DEFAULT,3,7717);
        pep.addIngredients(Ingredients.TomatoPaste);
        pep.addIngredients(Ingredients.Cheese);
        pep.addIngredients(Ingredients.Pepperoni);
        pep.addIngredients(Ingredients.Olives);
        or.addPizza(margarita);
        or.addPizza(pep);
        System.out.println(or.toString());
        Order or2 = new Order(7718);
        Pizza p3 = new Pizza("PizzaBase", Type.DEFAULT,11,7718);
        or2.addPizza(p3);
        System.out.println(or2.toString());
    }
}
