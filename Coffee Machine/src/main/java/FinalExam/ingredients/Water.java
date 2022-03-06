package FinalExam.ingredients;

public class Water extends Ingredient{

    public Water(double quantity) {
        this.setQuantity(quantity);
        this.setUnit("milliliters");
    }

    public double getEnergeticValue(){
        return 0;
    }

}
