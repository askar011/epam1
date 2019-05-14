package Test;


import edu.epam.train.Main.Ingredients;
import edu.epam.train.Main.Order;
import edu.epam.train.Main.Pizza;
import edu.epam.train.Main.Type;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
    static Order or1;
    static Pizza margarita;
    static Pizza pepperoni;

    @BeforeClass
    public static void setUp(){
        or1 = new Order(7717);
        margarita = new Pizza("Margarita", Type.CALZONE,2,7717);
        margarita.addIngredients(Ingredients.TomatoPaste);
        margarita.addIngredients(Ingredients.Pepper);
    }

    @AfterClass
    public static void setDown(){
        or1 = null;
        margarita = null;
        pepperoni = null;
    }

    @Test
    public void sum(){
        double expected = 6.2;
        double actual = or1.getSum(margarita) * margarita.getAmount();
        Assert.assertEquals(expected,actual,0.00);
    }

}