package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("White");
        car1.setModel("Zaporozhets Zaz-966");
        car1.setYearOfManufacture(1965);

        System.out.println("Год выпуска: " + car1.getYearOfManufacture());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());
        System.out.println();

        Motorbike bike1 = new Motorbike(2020, "Red", "Yamaha YZF-R1");

        System.out.println("Год выпуска: " + bike1.getYearOfManufacture());
        System.out.println("Цвет: " + bike1.getColor());
        System.out.println("Модель: " + bike1.getModel());


    }
}
