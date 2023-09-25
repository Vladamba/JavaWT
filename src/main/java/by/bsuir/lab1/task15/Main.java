package by.bsuir.lab1.task15;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Book[] arr = {new Book("Title", 7), new Book("Another title", 2), new Book("New title", 5)};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
