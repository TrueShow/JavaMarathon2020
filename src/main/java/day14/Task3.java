package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                String name = person[0];
                int age = Integer.parseInt(person[1]);
                if (age > 0) {
                    list.add(new Person(name,age));
                } else {
                    throw new Exception();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return list;
    }
}
