package edu.epam.pizza.entity;

public enum Type {
    DEFAULT(1),CALZONE(1.5);

    private double cost;

    Type(double i) {
        cost = i;
    }

    public double getCost() {
        return cost;
    }
}
