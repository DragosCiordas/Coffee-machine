package FinalExam.ingredients;

public class Sugar extends Ingredient{

    public Sugar(double quantity) {
        this.setQuantity(quantity);
        this.setUnit("grams");
    }

    public double getEnergeticValue(){
        return this.getQuantity()*4;
    } // 1g sugar has 4 Kcal


}
