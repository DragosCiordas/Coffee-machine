package FinalExam.coffeeTypes;

import FinalExam.ingredients.CoffeeBeans;
import FinalExam.ingredients.Milk;
import FinalExam.ingredients.Sugar;
import FinalExam.ingredients.Water;

public class Latte extends Caffee {
    public Latte(double sugar) {
        this.setBeans(new CoffeeBeans(18));
        this.setMilk(new Milk(150));
        this.setSugar(new Sugar(sugar));
        this.setWater(new Water(80));
    }

    public Latte() {
        this.setBeans(new CoffeeBeans(18));
        this.setMilk(new Milk(150));
        this.setWater(new Water(80));
    }


    @Override
    public void showNutritionalValue() {
        System.out.println(this.getClass() + "\n" + "proteins = " + this.getMilk().getProteinValue() + "\n" + "sugar = " + this.getSugar().getEnergeticValue() + "\n");
    }
    public String getName(){
        return "Latte";
    }
}
