package FinalExam.caffeeMachine.menu;

import FinalExam.coffeeTypes.Caffee;

public class Maker {
    public static void making(Caffee caffee) {
        System.out.println("Making your coffee");
        for (int i = 0; i < 15 ; i++) {

            if(i==0)
            {System.out.print("\nGrinding coffee");}

            if(i==3)
            {System.out.print("\nWarming water");}

            if(i==6)
            {System.out.print("\nCombining");}

            if(i==9)
            {System.out.print("\nAdding sugar");}

            if(i==12)
            {System.out.print("\nServing");}
            System.out.print(".");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
