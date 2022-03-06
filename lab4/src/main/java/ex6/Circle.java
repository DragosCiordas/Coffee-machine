package ex6;

public class Circle extends Shape {
    public double radius = 1.0;

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

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + this.radius +
                " which is a subclass of " + super.toString();
    }
}
