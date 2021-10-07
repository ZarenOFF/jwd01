package by.epam.tr.start;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest1 {
    @Test
    public void calcYT0011() {
        double x = 10;
        double realY;
        double expectedY = 9;

        realY = Function.calcY(x);
        Assert.assertEquals(expectedY, realY, 0.00000001);
    }
}