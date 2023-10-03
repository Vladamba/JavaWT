package by.bsuir.lab1.task5;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 6, 12, 3, 24, 7, 8};
        System.out.println(kElements(myArray));
    }

    public static int kElements(int[] arr) {
        int[] kArr = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            kArr[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    kArr[i] = Math.max(kArr[i], kArr[j] + 1);
                }
            }
        }

        int e = kArr[0];
        for (int i = 1; i < arr.length; i++) {
            e = Math.max(e, kArr[i]);
        }
        return arr.length - e;
    }
}
