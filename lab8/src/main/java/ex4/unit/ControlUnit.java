package ex4.unit;

public class ControlUnit {
    private static ControlUnit control;


    public static ControlUnit getControlUnit() {
        if (control == null) {
            control = new ControlUnit();
        } else {
            System.out.println("Alarm!");
        }


    }

}
