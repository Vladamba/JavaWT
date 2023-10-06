package by.bsuir.lab1.task8;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIndexes(new double[]{1, 2, 3, 4, 5, 6}, new double[]{0, 4, 6, 8, 9, 10})));
    }
    public static int[] getIndexes(double[] arr1, double[] arr2) {
        int[] result = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            result[i] = binarySearch(arr1, 0, arr1.length - 1, arr2[i]);
        }
        return result;
    }

    static int binarySearch(double[] arr, int leftBorder, int rightBorder, double element) {
        int result = -1;
        if (element <= arr[leftBorder])
            return leftBorder;
        if (element >= arr[rightBorder])
            return rightBorder;
        while (leftBorder <= rightBorder) {
            result = (leftBorder + rightBorder) / 2;
            if (element >= arr[result] && element < arr[result + 1])
                return result + 1;
            if (element < arr[result])
                rightBorder = result - 1;
            if (element > arr[result])
                leftBorder = result + 1;
        }
        return result;
    }
}
