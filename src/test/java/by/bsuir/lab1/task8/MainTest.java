package by.bsuir.lab1.task8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    double[] myArray1;
    double[] myArray2;
    @Before
    public void setUp(){
        myArray1 = new double[]{1, 2, 3, 4, 5, 6};
        myArray2 = new double[]{0, 4, 6, 8, 9, 10};
    }

    @Test
    public void testGetIndexes() {
        int[] result = new int[] {0, 4, 5, 5, 5, 5};
        Assert.assertArrayEquals(result, Main.getIndexes(myArray1, myArray2));
    }
}
