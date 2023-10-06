package by.bsuir.lab1.task16;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class MainTest {

    @Test
    public void testTitleComparator() {
        Book[] myArray = {new Book("Title", "Author", 7),
                new Book("Another title", "Another author", 2),
                new Book("New title", "New title", 5)};

        Book[] result = {new Book("Another title", "Another author", 2),
                new Book("New title", "New title", 5),
                new Book("Title", "Author", 7)};

        Comparator<Book> titleComparator = new TitleComparator();
        Arrays.sort(myArray, titleComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testTitleAuthorComparator() {
        Book[] myArray = {new Book("Title", "Author", 7),
                new Book("Another title", "Another author", 2),
                new Book("Title", "New author", 5)};

        Book[] result = {new Book("Another title", "Another author", 2),
                new Book("Title", "Author", 7),
                new Book("Title", "New author", 5)};

        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Arrays.sort(myArray, titleAuthorComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testAuthorTitleComparator() {
        Book[] myArray = {new Book("Title", "Author", 7),
                new Book("Another title", "Another author", 2),
                new Book("New title", "New title", 5)};

        Book[] result = {new Book("Another title", "Another author", 2),
                new Book("Title", "Author", 7),
                new Book("New title", "New title", 5)};

        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Arrays.sort(myArray, authorTitleComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testAuthorTitlePriceComparator() {
        Book[] myArray = {new Book("Title", "Author", 7),
                new Book("Title", "Another author", 2),
                new Book("New title", "New title", 5)};

        Book[] result = {new Book("Title", "Another author", 2),
                new Book("Title", "Author", 7),
                new Book("New title", "New title", 5)};

        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator()));
        Arrays.sort(myArray, authorTitlePriceComparator);

        Assert.assertArrayEquals(result, myArray);
    }
}
