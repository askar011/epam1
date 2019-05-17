package edu.epam.pizza.validator;

public class PizzaAmount {

    private static final int MAX_PIZZA_AMOUNT = 10;

    public static boolean amountIsValid(int amount){
        return amount < MAX_PIZZA_AMOUNT ? true : false;
    }
}
