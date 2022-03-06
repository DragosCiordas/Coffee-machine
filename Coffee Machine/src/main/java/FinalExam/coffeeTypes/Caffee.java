package FinalExam.coffeeTypes;

import FinalExam.ingredients.CoffeeBeans;
import FinalExam.ingredients.Milk;
import FinalExam.ingredients.Sugar;
import FinalExam.ingredients.Water;

public abstract class Caffee {
    private Water water;
    private Sugar sugar;
    private Milk milk;
    private CoffeeBeans beans;



    public void setWater(Water water) {
        this.water = water;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }



    public void setBeans(CoffeeBeans beans) {
        this.beans = beans;
    }

    public abstract void showNutritionalValue();
    public abstract String getName();


}
