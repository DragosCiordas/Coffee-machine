
package ciordas.dragos.lab1.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("First Number");
        int x = in.nextInt();
        System.out.println("Second Number");
        int y = in.nextInt();
        String primeNumbers = "";
        int num = 0;
        int z = 0;
        for (int i = x; i < y; i++) {
            int counter = 0;

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                z++;
            }
        }
        System.out.println(primeNumbers);
        System.out.println("Number of prime numbers :" + z);
    }
}

