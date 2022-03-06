package FinalExam.ingredients;

public class Caffeine {

    private String unit;
    private double value;

    public Caffeine(double value) {

        this.unit = "milligrams";
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
