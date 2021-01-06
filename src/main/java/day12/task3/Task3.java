package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("BTS", 2013));
        bands.add(new MusicBand("Imagine Dragons", 2008));
        bands.add(new MusicBand("Руки вверх", 1994));
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("Linkin Park", 1996));
        bands.add(new MusicBand("Время и Стекло", 2010));
        bands.add(new MusicBand("RASA", 2018));
        bands.add(new MusicBand("Френдзона", 2018));
        bands.add(new MusicBand("Nirvana", 1987));
        Collections.shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() >= 2000) {
                list.add(band);
            }
        }
        return list;
    }
}
