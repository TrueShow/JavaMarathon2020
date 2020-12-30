package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2011, 35.6f,38.0f);
        Airplane plane2 = new Airplane("Suhoi", 2015, 42.4f,38.0f);
        Airplane.compareAirplanes(plane1,plane2);
    }
}