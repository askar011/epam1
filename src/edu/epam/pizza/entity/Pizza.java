package edu.epam.pizza.entity;

import edu.epam.pizza.validator.PizzaAmount;
import edu.epam.pizza.validator.PizzaName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Pizza  {

    private static Logger logger = LogManager.getLogger();
    private static final int MAX_INGREDIENTS_COUNT = 8;
    private String name;
    public List<Ingredients> ingredientsList = new ArrayList<>(MAX_INGREDIENTS_COUNT);
    private Type type;
    private int amount;
    private int clientNumber;
    private int orderNumber;

    public Pizza(String name, Type type, int amount, Order order) {
        this.setAmount(amount);
        this.type = type;
        this.clientNumber = order.getClientNumber();
        this.orderNumber = order.getNumber();
        this.setName(name);
    }

    public void setName(String name) {
        if (PizzaName.nameIsValid(name)){
            logger.error("Name must be more than 4 letters");
            this.name = getOrderNumber() + "_" + getClientNumber();
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setAmount(int amount){
        if (PizzaAmount.amountIsValid(amount)) {
            this.amount = amount;
        } else {
            logger.error("You can have just 10pizza");
        }
    }

    public int getAmount() {
        return amount;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "[" + getOrderNumber() +":"+ getClientNumber() + ":" + getName() + ":" + getAmount() + "]";
    }


    public void addIngredients(Ingredients ingredient) {
        if (ingredientsList.contains(ingredient)){
            logger.error("This pizza already contains this ingredient");
        } else {
            ingredientsList.add(ingredient);
        }
    }


    public String getIngredientsList(List<Ingredients> list) {
        StringBuilder builder = new StringBuilder();
        for (Ingredients el : list){
            builder.append(el.name() + ": " + el.getCost() + "\n");
        }
        return builder.toString();
    }

}



