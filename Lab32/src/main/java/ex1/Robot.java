package ex1;

public class Robot {
    int x;

    public Robot() {
        this.x = 1;
    }

    int getX() {
        return this.x;
    }

    public void change(int k) {
        if (k >= 1)
            this.x = k + this.x;
    }

    public String toString() {
        return String.valueOf(x);
    }

    public static void main(String[] args) {

    }


}
