package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            double divider = scanner.nextDouble();
            double divided = scanner.nextDouble();
            if (divided == 0) {
                break;
            }
            else {
                System.out.println(divider / divided); ;
            }
        }
    }
}
