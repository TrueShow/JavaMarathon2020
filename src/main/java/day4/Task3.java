package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;

        int[][] arr = new int[m][n];
        fillArray(arr);

        int[] sum = new int[m];

        int max = sum[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("// " + sum[i]);
            if (sum[i] > max) {
                max = sum[i];
                index = i;
            }
            System.out.println();
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);
    }

    public static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }
}
