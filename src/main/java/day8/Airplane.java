package day8;

public class Airplane {
    private String producer;
    private int yearOfManufacture;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int yearOfManufacture, int length, int weight) {
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

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    private int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.yearOfManufacture +
                ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.getFuel());
    }

    public void fillUp(int n) {
        fuel += n;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer +
                ", год выпуска: " + yearOfManufacture +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}
