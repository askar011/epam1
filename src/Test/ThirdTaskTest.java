package Test;


import edu.epam.train.ThirdTask;
import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest {

    @Test
    public void ordered(){
        String actual = "12345678";
        boolean expected = true;
        Assert.assertEquals(expected,ThirdTask.ordered(actual));
    }
}