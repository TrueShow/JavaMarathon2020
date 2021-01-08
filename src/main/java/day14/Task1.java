package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(printSumDigits(file));
    }
    public static Integer printSumDigits(File file) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (int i = 0; i < numbers.length; i++) {
                list.add(Integer.parseInt(numbers[i]));
                sum += list.get(i);
            }
            if (list.size() != 10) {
                throw new RuntimeException("Некорректный входной файл");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return sum;
    }
}
