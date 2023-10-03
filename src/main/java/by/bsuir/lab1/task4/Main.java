package by.bsuir.lab1.task4;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 7, 10};
        boolean[] result = getIndexesOfPrimeElements(myArray);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static boolean[] getIndexesOfPrimeElements(int[] arr) {
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
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
