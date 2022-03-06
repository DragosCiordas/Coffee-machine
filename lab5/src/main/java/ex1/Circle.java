package ex1;

public class Circle extends Shape {
    public double radius = 1.0;

    public Circle() {
    }

    public Circle(String red, int i, boolean b) {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + this.radius;
    }

    @Override
    public double getAPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return 2* radius*radius;
    }

}
