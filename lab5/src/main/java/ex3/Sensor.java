package ex3;

public abstract class Sensor {
    public String location;

    abstract int readValue();

    public String getLocation(){
        return this.location;
    }

}
