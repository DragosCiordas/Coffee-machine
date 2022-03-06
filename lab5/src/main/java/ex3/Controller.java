package ex3;

public class Controller {
    public LightSensor light;
    public TemperatureSensor temp;

    public Controller() {
        this.light = new LightSensor();
        this.temp = new TemperatureSensor();
    }

    public void control() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("val light ="+this.light.readValue());
            System.out.println("val temp= "+ this.temp.readValue());
            Thread.sleep(1000);
        }
    }
}
