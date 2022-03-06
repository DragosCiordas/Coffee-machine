package ex1;

public class Coffee {
    private int temp;
    private int conc;
    private static int nrOfInstances;

    Coffee(int t, int c) {
        temp = t;
        conc = c;
        nrOfInstances++;
    }

    public static int getNrOfInstances() {
        return nrOfInstances;
    }

    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }


    public String toString() {
        return "Coffee{" + "temp=" + temp + ", concentration=" + conc + '}';
    }

}
