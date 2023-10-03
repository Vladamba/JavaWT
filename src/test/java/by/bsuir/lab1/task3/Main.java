package by.bsuir.lab1.task3;

public class Main {
    public static void main(String[] args) {
        double h = 0.01;
        double a = 0;
        double b = 3.14;
        System.out.println("-- x --- F(x) -");
        for (double x = a; x <= b; x += h)
            System.out.format("| %.2f | %.2f |\n", x, Math.tan(x));
        System.out.println("---------------");
    }
}
