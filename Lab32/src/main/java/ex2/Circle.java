package ex2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(String c, double r) {
        this.color = c;
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {

        return this.radius * this.radius * Math.PI;
    }

}
