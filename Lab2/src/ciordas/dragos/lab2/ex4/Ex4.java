package ciordas.dragos.lab1.ex4;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;



public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector vector = new Vector<>();
        System.out.println("Insert vector length");
        int n = in.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter element for position " + (i + 1) + " : ");
            vector.add(in.next());
        }
        Object max=Collections.max(vector); // limit at 321
        System.out.print("MAX=" + max);
    }
}
