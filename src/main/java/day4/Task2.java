package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент массива: " + maxElement(arr));
        System.out.println("Наименьший элемент массива: " + minElement(arr));
        System.out.println("Количество элементов массива, оканчивающихся на '0': " + countEndZero(arr));
        System.out.println("Сумма элементов массива, оканчивающихся на '0': " + sumElementsEndZero(arr));
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
    }

    public static Integer maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static Integer minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static Integer countEndZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 10 == 0) {
               count++;
           }
        }
        return count;
    }
    public static Integer sumElementsEndZero(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 10 == 0) {
               sum += arr[i];
           }
        }
        return sum;
    }
}
