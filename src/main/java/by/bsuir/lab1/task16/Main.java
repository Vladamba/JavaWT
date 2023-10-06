package by.bsuir.lab1.task16;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] myArray = {  new Book("Title", "Author", 7),
                        new Book("Another title", "Another author", 2),
                        new Book("New title", "New author", 5)};

        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator()));

        Arrays.sort(myArray, titleComparator);
        System.out.println(Arrays.toString(myArray));
    }
}
