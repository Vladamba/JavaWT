package by.bsuir.lab1.task4;

public class Main {
    public static void main(String[] args) {
        //final int N = 5;
        int[] myArray = {1, 2, 4, 7, 10};
        printIndexesOfPrimeElements(myArray);
    }

    public static void printIndexesOfPrimeElements(int[] arr) {
        boolean hasPrimeElements = false;
        for (int i = 0; i < arr.length; i++)
            if (isPrime(arr[i])) {
                hasPrimeElements = true;
                System.out.println(arr[i]);
            }
        if (!hasPrimeElements)
            System.out.println("No prime elements in your array");
    }

    public static boolean isPrime(int x) {
        if (x == 2) {
            return true;
        }
        if (x <= 1 || x % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
