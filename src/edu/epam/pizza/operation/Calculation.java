package edu.epam.pizza.operation;

import edu.epam.pizza.entity.Ingredients;
import edu.epam.pizza.entity.Pizza;

import java.util.List;

public class Calculation {

    // getting the cost of base pizza + with all ingredients
    public double getSum(Pizza pizza){
        double sum = pizza.getType().getCost();
        sum += getSumOfIngredients(pizza.ingredientsList);
        return sum;
    }

    public double getSumOfIngredients(List<Ingredients> list){
        double sum = 0;
        for (Ingredients el : list){
            sum += el.getCost();
        }
        return sum;
    }
}
