package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersA = new ArrayList<>();
        membersA.add("Гришин");
        membersA.add("Петров");
        membersA.add("Иванов");

        MusicBand bandA = new MusicBand("Nicson", 2002, membersA);
        System.out.println(bandA.getMembers());

        List<String> membersB = new ArrayList<>();
        membersB.add("Васильев");
        membersB.add("Николаев");
        membersB.add("Гушнев");

        MusicBand bandB = new MusicBand("Кукры", 1998, membersB);
        System.out.println(bandB.getMembers());

        MusicBand.transferMembers(bandA, bandB);
        System.out.println(bandA.getMembers());
        System.out.println(bandB.getMembers());

    }
}
