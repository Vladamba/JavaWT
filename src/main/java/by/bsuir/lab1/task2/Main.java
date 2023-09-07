package by.bsuir.lab1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isInside(7, -2));
    }
    public static boolean isInside(int x, int y) {
        return ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) ||
                ((x >= -6 && x <= 6) && (y >= -3 && y <= 0));
    }
}
