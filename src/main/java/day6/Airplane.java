package day6;

public class Airplane {
    private String producer;
    private int yearOfManufacture;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int yearOfManufacture, double length, double weight) {
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.yearOfManufacture +
                ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.getFuel());
    }

    public void fillUp(int n) {
        this.fuel += n;
    }
}
