package Test;


import optianaltask.ThirdTask;
import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest {

    @Test
    public void asceningNumbers(){
        String [] actual = {"44412","4124","214","3124","123","12332"};
        int expected = 123;
        Assert.assertEquals(expected,ThirdTask.ascendingNumbers(actual));
    }

    @Test
    public void asceningNumbers2(){
        String [] actual = {"2","1","12345","214","3124","123","12332"};
        int expected = 2;
        Assert.assertEquals(expected,ThirdTask.ascendingNumbers(actual));
    }

    @Test
    public void ordered(){
        String actual = "12345678";
        boolean expected = true;
        Assert.assertEquals(expected,ThirdTask.ordered(actual));
    }
}