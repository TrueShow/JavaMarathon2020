package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива > ");
        int[] arr = createArrayBetween0And10(scanner.nextInt());
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + countEight(arr));
        System.out.println("Количество чисел равных 1: " + countOne(arr));
        System.out.println("Количество четных чисел: " + countEven(arr));
        System.out.println("Количество нечетных чисел: " + countOdd(arr));
        System.out.println("Сумма всех элементов массива: " + sumElementsOfArray(arr));
        System.out.println();

//        int countMoreEight = 0;
//        int countEqualsOne = 0;
//        int countEven = 0;
//        int countOdd = 0;
//        int sumElements = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sumElements += arr[i];
//            if (arr[i] > 8) {
//                countMoreEight++;
//            }
//            if (arr[i] == 1) {
//                countEqualsOne++;
//            }
//            if (arr[i] % 2 == 0) {
//                countEven++;
//            }
//            if (arr[i] % 2 != 0) {
//                countOdd++;
//            }
//        }
//        System.out.println("Массив: " + Arrays.toString(arr));
//        System.out.println("Длина массива: " + arr.length);
//        System.out.println("Количество чисел больше 8: " + countMoreEight);
//        System.out.println("Количество чисел равных 1: " + countEqualsOne);
//        System.out.println("Количество четных чисел: " + countEven);
//        System.out.println("Количество нечетных чисел: " + countOdd);
//        System.out.println("Сумма всех элементов массива: " + sumElements);
    }

    public static int[] createArrayBetween0And10(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static Integer countEight(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                count++;
            }
        }
        return count;
    }

    public static Integer countOne(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
    public static Integer countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static Integer countOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static Integer sumElementsOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
