package by.bsuir.lab1.task9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    Ball bigBlueBall;
    Ball smallGreenBall;
    Ball smallBlueBall;
    Basket basket;
    @Before
    public void setUp(){
        bigBlueBall = new Ball(1000, "blue");
        smallGreenBall = new Ball(200, "green");
        smallBlueBall = new Ball(150, "blue");
        basket = new Basket();

        basket.addBall(bigBlueBall);
        basket.addBall(smallGreenBall);
        basket.addBall(smallBlueBall);
    }

    @Test
    public void testCountBallsByColor()
    {
        int result = 2;
        Assert.assertEquals(result, basket.countBallsByColor("blue"));
    }

    @Test
    public void testCountWeight()
    {
        int result = 1350;
        Assert.assertEquals(result,basket.countWeight());
    }
}
