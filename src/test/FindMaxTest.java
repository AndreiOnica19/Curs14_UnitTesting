package test;

import main.FindMax;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMaxTest {

    @Test
    public void findMax_ShouldReturnMaxValueFromArray(){
        FindMax findMax = new FindMax();
        double result = findMax.getMax(new double[] {1.1, 1.4, 1.3});
        Assert.assertEquals(result, 1.4, "The values don't match!");
    }
}
