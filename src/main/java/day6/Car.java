package day6;

public class Car {
    private int yearOfManufacture;
    private String model;
    private String color;

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public Integer yearDifference(int inputYear) {
        if (inputYear < this.yearOfManufacture) {
            System.out.println("Неверные данные");
        }
        return inputYear - this.yearOfManufacture;
    }
}
