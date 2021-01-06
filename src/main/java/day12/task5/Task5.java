package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Гришин", 22);
        MusicArtist artist2 = new MusicArtist("Петров", 19);
        MusicArtist artist3 = new MusicArtist("Кушнев", 25);
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(artist1);
        members1.add(artist2);
        members1.add(artist3);

        MusicBand bandA = new MusicBand("Nicson", 2002, members1);

        MusicArtist ivanov = new MusicArtist("Иванов", 25);
        MusicArtist vasiliev = new MusicArtist("Васильев", 20);
        MusicArtist nikolaev = new MusicArtist("Николаев", 23);
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(ivanov);
        members2.add(vasiliev);
        members2.add(nikolaev);

        MusicBand bandB = new MusicBand("Кукры", 1998, members2);

        System.out.println(bandA.getMembers());
        System.out.println(bandB.getMembers());

        MusicBand.transferMembers(bandA, bandB);

        System.out.println(bandA.getMembers());
        System.out.println(bandB.getMembers());
    }
}
