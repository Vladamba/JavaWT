package by.bsuir.lab1.task16;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
