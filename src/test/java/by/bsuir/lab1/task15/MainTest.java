package by.bsuir.lab1.task15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import java.util.Arrays;
public class MainTest {
    @Test
    public void testComparator()
    {
        Book[] myArray = {new Book("Title", 7), new Book("Another title", 2), new Book("New title", 5)};
        Book[] result = {new Book("Another title", 2), new Book("New title", 5), new Book("Title", 7)};
        Arrays.sort(myArray);
        Assert.assertArrayEquals(result, myArray);
    }
}
