package by.bsuir.lab1.task7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
public class MainTest {

    double[] myArray;
    double delta;
    @Before
    public void setUp(){
        myArray = new double[] {5.1, 10, 6, 12.5, 3, 24, 7, 8};
        delta = 0.000001;
    }

    @Test
    public void testShellSort() {
        double[] result = new double[] {3.0, 5.1, 6.0, 7.0, 8.0, 10.0, 12.5, 24.0};
        Assert.assertArrayEquals(result, Main.shellSort(myArray), delta);
    }
}
