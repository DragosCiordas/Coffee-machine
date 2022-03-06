package ciordas.dragos.lab1.ex7;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        long rd = Math.round(Math.random() * 10);
        int r = (int) rd;
        System.out.println("Guess the number (0-10):");


        System.out.println();
        for (int i = 1; i <= 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any number: " + (4 - i) + " chances");
            int guess = scan.nextInt();
            System.out.println();
            if (guess > r) {
                System.out.print("Too high ");
            }
            if (guess < r) {
                System.out.print("Too Low ");
            }

            if (guess == r) {
                System.out.print("BINGO");
                break;
            }
        }

        System.out.println();
        System.out.println("    GAME OVER");
    }
}
