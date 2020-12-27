package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int index = 0;
        int max = 0;

        int[] arr = new int[n];
        fillArray(arr);

        int[][] tmp = new int[3][arr.length - 2];
        int[] sum = new int[arr.length - 2];

        for (int i = 0; i < arr.length - 2; i++) {
            tmp[0][i] = arr[i];
            tmp[1][i] = arr[i + 1];
            tmp[2][i] = arr[i + 2];
            sum[i] = tmp[0][i] + tmp[1][i] + tmp[2][i];
            if (sum[i] > max) {
                max = sum[i];
                index = tmp[0][i];
            }
        }

//        System.out.println(Arrays.toString(arr));
//        printArray(tmp);

//        System.out.println(Arrays.toString(sum));
        System.out.println("сумма тройки: " + max);
        System.out.println("индекс первого элемента тройки: " + index);

    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
    }

//    public static void printArray(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t ");
//            }
//            System.out.println();
//        }
//    }
}
