package ciordas.dragos.lab1.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("First number ");
            int x = in.nextInt();
            System.out.println("Second number ");
            int y = in.nextInt();
            if(x>y)
                System.out.println("x="+x);
            else
                System.out.println("y="+y);



    }
}
