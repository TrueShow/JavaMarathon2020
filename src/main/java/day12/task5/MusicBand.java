package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist musicArtist) {
        members.add(musicArtist);
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        for (int i = 0 ; i < bandA.getMembers().size() ; i++) {
            bandB.addMember(bandA.getMembers().get(i));
        }
        bandA.getMembers().clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
