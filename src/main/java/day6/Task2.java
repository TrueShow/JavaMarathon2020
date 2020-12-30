package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2012, 42.5f, 38150.0f);
        plane1.setLength(39.5f);
        plane1.setYearOfManufacture(2011);
        plane1.fillUp(20_000);
        plane1.fillUp(20_530);
        plane1.info();
    }
}
