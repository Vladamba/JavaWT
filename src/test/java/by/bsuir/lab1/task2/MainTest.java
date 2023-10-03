package by.bsuir.lab1.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    int x;
    int y;
    @Before
    public void setUp(){
        x = 7;
        y = -2;
    }

    @Test
    public void testIsInside()
    {
        boolean result = false;
        Assert.assertEquals(result, Main.isInside(x, y));
    }
}
