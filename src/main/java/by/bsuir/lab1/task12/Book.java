package by.bsuir.lab1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book book) || obj.hashCode() != hashCode()) {
            return false;
        }

        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }


    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + Integer.valueOf(price).hashCode() + 12;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition + "\n";
    }
}
