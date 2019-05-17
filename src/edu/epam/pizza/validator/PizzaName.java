package edu.epam.pizza.validator;

public class PizzaName {

    private static final int MIN_LENGTH_NAME = 4;
    private static final int MAX_LENGTH_NAME = 20;

    public static boolean nameIsValid(String name) {
        return name.length() < MIN_LENGTH_NAME || name.length() > MAX_LENGTH_NAME;
    }
}
