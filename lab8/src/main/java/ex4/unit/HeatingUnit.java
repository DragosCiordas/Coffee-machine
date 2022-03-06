package ex4.unit;

public class HeatingUnit {
    private static int temp;
    public HeatingUnit() {
    }

    @Override
    public String toString() {
        return "HeatingUnit{}";
    }
    public void execute(){
        System.out.println("Alarm!");
    }
}