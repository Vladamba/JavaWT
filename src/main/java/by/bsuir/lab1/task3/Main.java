package by.bsuir.lab1.task3;

public class Main {
    public static void main(String[] args) {
        double h = 0.1;
        double a = 0;
        double b = 3.14;
        System.out.println(drawTan(h, a, b));
    }

    public static String drawTan(double h, double a, double b) {
        String s = "| x | F(x) |\n";
        for (double x = a; x <= b; x += h) {
            s += "| " + x + " | " + Math.tan(x) + " |\n";
        }
        return s;
    }
}
