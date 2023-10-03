package by.bsuir.lab1.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    int[] myArray;

    @Before
    public void setUp(){
        myArray = new int[]{1, 2, 4, 7, 10};
    }

    @Test
    public void testGetIndexesOfPrimeElements() {
        boolean[] result = {false, true, false, true, false};
        Assert.assertArrayEquals(result, Main.getIndexesOfPrimeElements(myArray));
    }
}
