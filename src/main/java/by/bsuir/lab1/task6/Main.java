package by.bsuir.lab1.task6;

public class Main {
    public static void main(String[] args) {
        double[] myArray = {1, 2.5, 3, 4.5, 5, 6, 7.5, 8};
        System.out.printf(getMatrix(myArray));
    }
    public static String getMatrix(double[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                s += arr[j] + " ";
            }
            for (int k = 0; k < i; k++) {
                s += arr[k] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
