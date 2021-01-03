package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * this.radius;
    }
}
