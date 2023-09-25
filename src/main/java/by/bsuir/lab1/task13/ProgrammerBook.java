package by.bsuir.lab1.task13;

import java.util.Objects;

public class ProgrammerBook extends by.bsuir.lab1.task12.Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProgrammerBook programmerBook) || !super.equals(obj)) {
            return false;
        }

        return this.language.equals(programmerBook.language) && this.level == programmerBook.level;
    }

    @Override
    public int hashCode() {
        return language.hashCode() + level + 13;
    }

    @Override
    public String toString() {
        return "Language: " + language + "\nLevel: " + level + "\n";
    }
}
