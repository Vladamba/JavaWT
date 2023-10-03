package by.bsuir.lab1.task5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    int[] myArray;

    @Before
    public void setUp(){
        myArray = new int[]{5, 10, 6, 12, 3, 24, 7, 8};
    }

    @Test
    public void testGetIndexesOfPrimeElements() {
        int result = 4;
        Assert.assertEquals(result, Main.kElements(myArray));
    }
}
