package Test;

import edu.epam.pizza.entity.Ingredients;
import edu.epam.pizza.entity.Order;
import edu.epam.pizza.entity.Pizza;
import edu.epam.pizza.entity.Type;
import edu.epam.pizza.report.CheckReport;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
    static Order order1;
    static Pizza margarita;
    static Pizza pepperoni;
    static CheckReport checkReport;

    @BeforeClass
    public static void setUp(){
        order1 = new Order(7717);
        checkReport =new CheckReport();
        margarita = new Pizza("margarita", Type.CALZONE,2,order1);
        margarita.addIngredients(Ingredients.TomatoPaste);
        margarita.addIngredients(Ingredients.Pepper);
        margarita.addIngredients(Ingredients.Garlic);
        margarita.addIngredients(Ingredients.Bacon);

        pepperoni = new Pizza("Peperoni", Type.DEFAULT,3,order1);
        pepperoni.addIngredients(Ingredients.TomatoPaste);
        pepperoni.addIngredients(Ingredients.Cheese);
        pepperoni.addIngredients(Ingredients.Pepperoni);
        pepperoni.addIngredients(Ingredients.Olives);

        order1.addPizza(margarita);
        order1.addPizza(pepperoni);
    }

    @AfterClass
    public static void setDown(){
        order1 = null;
        margarita = null;
        pepperoni = null;
        checkReport = null;
    }

    @Test
    public void sum(){
        double expected = 24.2;
        checkReport.checkList(order1.getPizzaList(),order1.orderTime);
        double actual = checkReport.getTotalCost();
        Assert.assertEquals(expected,actual,0.00);
    }
}