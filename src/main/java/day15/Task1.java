package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        List<Shoes> emptyList = searchMissingShoes(parseFileToShoesList(file));
        writeMissingShoesToFile(emptyList);
    }

    public static List<Shoes> searchMissingShoes(List<Shoes> list) {
        List<Shoes> missingShoes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCount() == 0) {
                missingShoes.add(list.get(i));
            }
        }
        return missingShoes;
    }

    public static List<Shoes> parseFileToShoesList(File file) {
        List<Shoes> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] range = line.split(";");
                list.add(new Shoes(range[0],Integer.parseInt(range[1]),Integer.parseInt(range[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }

    public static void writeMissingShoesToFile(List<Shoes> list) {
        File file = new File("src/main/resources/missing_shoes.txt");
        try(PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < list.size(); i++) {
                pw.println(list.get(i).getName() + ", " + list.get(i).getSize() + ", " + list.get(i).getCount());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
