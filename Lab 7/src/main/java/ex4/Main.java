package ex4;

import java.io.*;

public class Main {
    private String fileToStoreObject = "src/main/resources/cars.txt";

    public static void main(String[] args) {
        Main main = new Main();
        Car car = new Car("Duster", 15000);
        main.serializeCar(car);
        System.out.println("Obj Serialized " + car);
        System.out.println("Deserialized obj" + main.deserializeCar());
    }

    private Car deserializeCar() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileToStoreObject))) {
            return (Car) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void serializeCar(Car car) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fileToStoreObject));) {
            o.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
