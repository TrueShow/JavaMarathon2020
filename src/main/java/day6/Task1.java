package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfManufacture(2018);
        car1.info();
        System.out.println("Разница: " + car1.yearDifference(2020) + " года");
    }
}
