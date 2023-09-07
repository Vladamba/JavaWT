package by.bsuir.lab1.task6;

public class Main {
    public static void main(String[] args) {
        double[] myArray = {1, 2.5, 3, 4.5, 5, 6, 7.5, 8};
        printMatrix(myArray);
    }
    public static void printMatrix(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.printf("%.2f ", arr[j]);
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%.2f ", arr[k]);
            }
            System.out.println();
        }
    }
}
