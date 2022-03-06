package ex4;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;

    }

    public MyPoint(int x0, int y0) {
        this.x = x0;
        this.y = y0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setXY(int x0, int y0) {
        this.x = x0;
        this.y = y0;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x0, int y0) {
        return Math.sqrt(Math.pow((x0 - this.x), 2) + Math.pow((y0 - this.y), 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    }
}
