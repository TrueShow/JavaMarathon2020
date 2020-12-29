package day6;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задача 1: ");
        Car car1 = new Car();
        car1.setYearOfManufacture(2018);
        car1.info();
        System.out.println("Разница: " + car1.yearDifference(2020) + " года");

        System.out.println("\nЗадача 2:");
        Airplane plane1 = new Airplane("Boeing", 2012, 42.5f, 38150.0f);
        plane1.setLength(39.5f);
        plane1.setYearOfManufacture(2011);
        plane1.setFuel(20_000);
        plane1.setFuel(20_530);
        plane1.info();

        System.out.println("\nЗадача 3:");
        Teacher teacher1 = new Teacher("Сергей Степанович", "математика");
        Student student1 = new Student("Петров");
        teacher1.evaluate(student1);

    }
}
