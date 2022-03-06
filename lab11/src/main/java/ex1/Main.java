package ex1;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor= new TemperatureSensor();
        Interface inter=new Interface();
        sensor.register(inter);
        new Thread(sensor).start();
    }
}
