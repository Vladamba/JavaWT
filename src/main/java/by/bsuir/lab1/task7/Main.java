package by.bsuir.lab1.task7;
import java.util.Arrays;
public class Main {
    public static void main(String [] args){
        double[] myArray ={5.1, 10, 6, 12.5, 3, 24, 7, 8};
        System.out.println(Arrays.toString(shellSort(myArray)));
    }
    public static double[] shellSort(double[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int outer = h; outer < arr.length; outer++) {
                double tmp = arr[outer];
                int inner = outer;
                while (inner > h - 1 && arr[inner - h] > tmp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = tmp;
            }
            h = (h - 1) / 3;
        }
        return arr;
    }
}
