package FinalExam.ingredients;

public abstract class Ingredient {
    private double quantity;
    private double nutritionalValue;
    private String unit ;

    abstract double getEnergeticValue();

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(double nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }


    public void setUnit(String unit) {
        this.unit = unit;
    }
}
