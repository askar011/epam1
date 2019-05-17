package edu.epam.pizza.entity;

public enum Ingredients {

    TomatoPaste(1),Cheese(1),Salami(1.5),Bacon(1.2),Garlic(0.3),Corn(0.7),Pepper(0.6),Olives(0.5),
    Pepperoni(1.5);

    private double cost;

    Ingredients(double i) {
        cost = i;
    }

    public double getCost() {
        return cost;
    }
}
