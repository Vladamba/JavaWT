package by.bsuir.lab1.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    double x;
    double y;
    double delta;
    @Before
    public void setUp(){
        x = 5;
        y = 12.5;
        delta = 0.000001;
    }

    @Test
    public void testCalculate()
    {
        double result = 5.278937142696228;
        Assert.assertEquals(result, Main.calculate(x, y), delta); //assertArrayEquals
    }
}
