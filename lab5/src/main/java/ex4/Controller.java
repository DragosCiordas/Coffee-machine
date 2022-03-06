package ex4;

import ex3.LightSensor;
import ex3.TemperatureSensor;

public class Controller {
    private static LightSensor light;
    private static TemperatureSensor temp;

    private Controller() {
        this.light = new LightSensor();
        this.temp = new TemperatureSensor();
    }

    private static void control() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("val light ="+Controller.light.readValue());
            System.out.println("val temp= "+ Controller.temp.readValue());
            Thread.sleep(1000);
        }
    }
}
