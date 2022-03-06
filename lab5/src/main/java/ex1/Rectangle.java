package ex1;

public class Rectangle extends Shape {
    public double length = 1.0;
    public double width = 1.0;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, boolean filled, String color) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "A rectangle with " +
                "length=" + length +
                ", width=" + width;


    }


    @Override
    public double getAPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return  width * length;
    }
}
