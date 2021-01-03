package day9.Task2;

public class Circle extends Figure {
    private int radius;
    private final double PI = 3.14;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(this.radius, 2) * PI;
    }

    @Override
    public double perimeter() {
        return PI * 2 * this.radius;
    }
}
