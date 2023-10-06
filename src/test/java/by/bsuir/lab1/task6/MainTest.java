package by.bsuir.lab1.task6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    double[] myArray;
    @Before
    public void setUp(){
        myArray = new double[] {1, 2.5, 3, 4.5, 5, 6, 7.5, 8};
    }

    @Test
    public void testGetMatrix() {
        String result = """
                1.0 2.5 3.0 4.5 5.0 6.0 7.5 8.0\s
                2.5 3.0 4.5 5.0 6.0 7.5 8.0 1.0\s
                3.0 4.5 5.0 6.0 7.5 8.0 1.0 2.5\s
                4.5 5.0 6.0 7.5 8.0 1.0 2.5 3.0\s
                5.0 6.0 7.5 8.0 1.0 2.5 3.0 4.5\s
                6.0 7.5 8.0 1.0 2.5 3.0 4.5 5.0\s
                7.5 8.0 1.0 2.5 3.0 4.5 5.0 6.0\s
                8.0 1.0 2.5 3.0 4.5 5.0 6.0 7.5 \n""";
        Assert.assertEquals(result, Main.getMatrix(myArray));
    }
}
