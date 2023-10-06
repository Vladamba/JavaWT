package by.bsuir.lab1.task16;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
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
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition + "\n";
    }
}
