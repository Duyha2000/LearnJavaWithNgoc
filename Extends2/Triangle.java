package Extends2;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String colour, double side1, double side2, double side3) {
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        super("");
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Công thức herong: S = sqrt(p(p-a)(p-b)(p-c))
    // p = (a+b+c) là nua chu vi
    public double getChuvi() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        double p = getChuvi() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public String toString() {
        return "Triangle: " + getColour() + " " + side1 + " " + side2 + " " + side3;
    }
}