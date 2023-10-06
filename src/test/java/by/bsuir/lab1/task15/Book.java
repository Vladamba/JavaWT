package by.bsuir.lab1.task15;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
        this.author = "Unknown";
        this.price = 0;
    }

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
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition + "\nIsbn: " + isbn + "\n";
    }

    @Override
    public int compareTo(Book obj) {
        return this.isbn - obj.isbn;
    }
}
