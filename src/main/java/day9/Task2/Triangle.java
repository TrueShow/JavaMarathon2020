package day9.Task2;

public class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        double p = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        return Math.sqrt(p * ((p - this.firstSide) * (p - this.secondSide) * (p - this.thirdSide)));
    }

    @Override
    public double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }
}
