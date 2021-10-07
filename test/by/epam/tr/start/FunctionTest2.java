package by.epam.tr.start;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest2 {
    @Test
    public void calcYT0021() {
        double x = 2;
        double realY;
        double expectedY = 0.2;

        realY = Function.calcY(x);
        Assert.assertEquals(expectedY, realY, 0.00000001);
    }
}
