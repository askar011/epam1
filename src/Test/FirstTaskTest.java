package Test;


import optianaltask.FirstTask;
import org.junit.Assert;
import org.junit.Test;

public class FirstTaskTest {

    @Test
    public void sum(){
        int expected = 15;
        String [] args = {"1","2","3","4","5"};
        int actual = FirstTask.sum(args);
        Assert.assertEquals(expected,actual);
    }
}