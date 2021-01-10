package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File fileOutput1000 = new File("file1.txt");
        File fileOutput50 = new File("file2.txt");

        try {
            PrintWriter pw1000 = new PrintWriter(fileOutput1000);
            PrintWriter pw50 = new PrintWriter(fileOutput50);

            for (int i = 0; i < 1000; i++) {
                pw1000.print((int)(Math.random() * 100) + " ");
            }
            pw1000.close();

            Scanner scanner = new Scanner(fileOutput1000);
            List<Integer> list = new ArrayList<>();
            String[] numbers = scanner.nextLine().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                list.add(Integer.parseInt(numbers[i]));
            }

            List<List<Integer>> lists = split(list, 20);
            for (int i = 0; i < lists.size(); i++) {
                int sum = 0;
                for (int j = 0; j < lists.get(i).size(); j++) {
                    sum += lists.get(i).get(j);
                }
                double result = (double) sum / lists.get(i).size();
                pw50.print(result + " ");
            }
            pw50.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(fileOutput50);
    }

    public static void printResult(File file) {
        double result = 0.0;
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");

            for (int i = 0; i < numbers.length; i++) {
                result += Double.parseDouble(numbers[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println((int)result);
    }

    public static List<List<Integer>> split(List<Integer> list, int splitter) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < list.size(); i += splitter) {
            lists.add(list.subList(i, i + splitter));
        }
        return lists;
    }
}
