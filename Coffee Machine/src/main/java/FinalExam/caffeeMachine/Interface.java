package FinalExam.caffeeMachine;

import FinalExam.caffeeMachine.menu.Maker;
import FinalExam.caffeeMachine.menu.Menu;
import FinalExam.caffeeMachine.menu.submenu.CoffeeTypes;
import FinalExam.caffeeMachine.menu.submenu.FileHandler;
import FinalExam.caffeeMachine.menu.submenu.NutritionValue;
import FinalExam.caffeeMachine.menu.submenu.PaymentMenu;
import FinalExam.payment.Card;
import FinalExam.payment.Cash;
import FinalExam.coffeeTypes.*;
import FinalExam.ingredients.Sugar;
import java.util.Scanner;

public class Interface {

    private static Caffee currentCoffee;


    public static void menuController(int z) {
        int value = 0;
        switch (z) {
            case 1:
                System.out.println("You have to pay 3 ron");
                value = 3;
                currentCoffee = new Americano();
                break;
            case 2:
                System.out.println("You have to pay 5 ron");
                value = 5;
                currentCoffee = new Latte();
                break;
            case 3:
                System.out.println("You have to pay 4 ron");
                value = 4;
                currentCoffee = new Cappuccino();
                break;
            case 4:
                System.out.println("You have to pay 2 ron");
                value = 2;
                currentCoffee = new Expresso();
                break;
            default:
                System.out.println("Wrong value");
                break;
        }
        addSugar();
        showPayment(value);
        Maker.making(currentCoffee);
        FileHandler.file("file.txt",currentCoffee.getName());
    }

    public static void showMenu() {
        System.out.println(Menu.MENU.getText());

    }

    public static void showCoffeeTypes() {
        System.out.println(CoffeeTypes.MENU.getText());
    }

    public static void showNutritionValue() {
        System.out.println(NutritionValue.MENU.getText());
        currentCoffee.showNutritionalValue();
    }

    public static void showNutritionValue(Caffee caffee, int sc) {
        System.out.println(NutritionValue.MENU.getText());


        switch (sc) {
            case 1:
                caffee.showNutritionalValue();
                break;
            default:
                System.out.println("Wrong value");
                break;

        }

    }

    public static void showPayment(int z) {
        System.out.println(PaymentMenu.MENU.getText());
        pay(z);
    }

    public static void pay(int value) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                Cash cash = new Cash(100);
                cash.pay(value);
                break;
            case 2:
                Card card = new Card(100);
                card.pay(value);
                break;
            default:
                System.out.println("Wrong value");
                break;
        }

    }

    public static void showPayment() {
        System.out.println(PaymentMenu.MENU.getText());
    }

public static void addSugar (){
    System.out.println("Enter sugar value");
    Scanner scn = new Scanner(System.in);
    int h = scn.nextInt();
    currentCoffee.setSugar(new Sugar(h));
}



    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int c;

        do {
            showMenu();
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    showCoffeeTypes();
                    System.out.println("Enter value");
                    int z = scanner.nextInt();
                    menuController(z);
                    break;
                case 2:
                    if (currentCoffee==null) {
                        System.out.println("Select your coffee");
                        showCoffeeTypes();
                        System.out.println("Enter value");
                        int ok = scanner.nextInt();
                        menuController(ok);
                        break;
                    }
                    break;
                case 3:
                    Scanner sc = new Scanner(System.in);
                    showNutritionValue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong value");
                    break;
            }
        } while (true);

    }
}
