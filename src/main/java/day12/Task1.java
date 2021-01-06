package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Renaut Logan",
                "Volkswagen Tiguan", "Renault Duster", "Lada Largus", "Valkswagen Polo"));
        System.out.println(list);
        list.add(3, "Hyndai Solaris");
        list.remove(0);
        System.out.println(list);
    }
}
