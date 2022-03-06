package ex3;

import java.util.Random;

public class TemperatureSensor {

    public int readValue() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
