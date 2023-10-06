package by.bsuir.lab1.task16;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getPrice() - obj2.getPrice();
    }
}
