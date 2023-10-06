package by.bsuir.lab1.task14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Book book1;
    Book book2;
    @Before
    public void setUp() {
        book1 = new Book("Title", "Author", 7);
        book2 = book1.clone();
    }

    @Test
    public void testEquals()
    {
        boolean result = true;
        Assert.assertEquals(result, book1.equals(book2));
    }
}
