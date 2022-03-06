package ex4.sensor;

public class TemperatureSensor {
    private static int temperatureSensor;
    public TemperatureSensor() {
        super();
    }
    public int getTemperatureSensor(){
        return this.temperatureSensor;
    }

    public static void setTemperatureSensor(int temperatureSensor) {
        TemperatureSensor.temperatureSensor = temperatureSensor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

