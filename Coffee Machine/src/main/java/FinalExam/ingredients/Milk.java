package FinalExam.ingredients;

public class Milk extends Ingredient {

    public Milk(double quantity) {
        this.setQuantity(quantity);
        this.setUnit("milliliters");
        this.setNutritionalValue(quantity);
    }

    public double getEnergeticValue() {
        return this.getQuantity() * 0.5;
    } //1 ml of milk has 0.5 Kcal

    public double getProteinValue() {
        return this.getNutritionalValue() * 0.04;
    } // protein calculator
}
