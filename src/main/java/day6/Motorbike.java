package day6;

public class Motorbike {
    private String color;
    private int yearOfManufacture;
    private String model;

    public Motorbike(int yearOfManufacture, String color, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public Integer yearDifference(int inputYear) {
        if (inputYear < this.yearOfManufacture) {
            System.out.println("Неверные данные");
        }
        return inputYear - this.yearOfManufacture;
    }
}
