package FinalExam.coffeeTypes;

import FinalExam.ingredients.CoffeeBeans;
import FinalExam.ingredients.Milk;
import FinalExam.ingredients.Sugar;
import FinalExam.ingredients.Water;

public class Americano extends Caffee {
public double sugar;

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public Americano(double sugar) {
        this.setBeans(new CoffeeBeans(18));
        this.setMilk(new Milk(0));
        this.setSugar(new Sugar(sugar));
        this.setWater(new Water(180));
    }

    public Americano() {
        this.setBeans(new CoffeeBeans(18));
        this.setMilk(new Milk(0));
        this.setWater(new Water(180));
    }

    @Override
    public void showNutritionalValue() {
        System.out.println(this.getClass() + "\n" + "proteins = 0" + "\n" + "sugar = " + this.getSugar().getEnergeticValue() + "\n");
    }
    public String getName(){
        return "Americano";
    }
}
