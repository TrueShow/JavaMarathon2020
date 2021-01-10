package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileInput = new File("test.txt");
        printResult(fileInput);
    }

    public static void printResult(File file) {
        DecimalFormat df = new DecimalFormat();
        int sum = 0;
        double result = 0.0;
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");

            for (int i = 0; i < stringNumbers.length; i++) {
                 sum += Integer.parseInt(stringNumbers[i]);
            }
            result = (double) sum / stringNumbers.length;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.print(result + " --> " + df.format(result));

    }
}

