package day9.Task2;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        int p = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        return Math.cbrt(p * ((p - this.firstSide) * (p - this.secondSide) * (p - this.thirdSide)));
    }

    @Override
    public double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }
}
