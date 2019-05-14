package edu.epam.train.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Service{
    private static Logger logger = LogManager.getLogger();
    private String name;
    public List<Ingredients> ingredientsList = new ArrayList<>(8);
    private Type type;
    private int amount;
    private int clientNumber;

    public Pizza(String name, Type type, int amount,int clientNumber) {
        this.setName(name,clientNumber);
        this.setAmount(amount);
        this.type = type;
        this.clientNumber = clientNumber;
    }

    public void setName(String name,int clientNumber) {
        if (name.length() < 4 || name.length() > 20){
            logger.error("Name must be more than 4 letters");
            this.name = Order.getNumber() + "_" + clientNumber;
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
        if (amount > 10) {
            logger.error("You can have just 10pizza");
        } else {
            this.amount = amount;
        }
    }

    public int getAmount() {
        return amount;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    @Override
    public String toString() {
        return "[" + Order.getNumber() +":"+ getClientNumber() + ":" + getName() + ":" + getAmount() + "]";
    }

    @Override
    public void addIngredients(Ingredients ingredient) {
        if (ingredientsList.contains(ingredient)){
            logger.error("This pizza already contains this ingredient");
        } else {
            ingredientsList.add(ingredient);
        }
    }

    @Override
    public String getIngredientsList(List<? extends Ingredients> list) {
        StringBuilder builder = new StringBuilder();
        for (Ingredients el : list){
            builder.append(el.name() + ": " + el.getCost() + "\n");
        }
        return builder.toString();
    }

}



