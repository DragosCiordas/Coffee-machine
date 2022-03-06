package ex3;

import java.util.Random;

public class LightSensor {

    public int readValue() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

}
