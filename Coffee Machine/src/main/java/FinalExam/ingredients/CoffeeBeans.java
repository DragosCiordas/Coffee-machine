package FinalExam.ingredients;

public class CoffeeBeans extends Ingredient {
    private Caffeine caffeine;

    public CoffeeBeans(double quantity) {
        this.setQuantity(quantity);
        this.setUnit("grams");
        this.caffeine = new Caffeine(this.getQuantity()*40);
    }

    public double getEnergeticValue() {
        return 0;
    }

}
