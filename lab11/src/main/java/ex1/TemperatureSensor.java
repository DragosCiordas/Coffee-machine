package ex1;

import java.util.Random;

public class TemperatureSensor extends Observable implements Runnable {
    Random var = new Random();

    public void run() {
        while (true) {
            this.changeState(var.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
