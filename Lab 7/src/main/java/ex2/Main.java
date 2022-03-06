package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("src/main/resources/data.txt"))) {
            String s;
            while ((s = in.readLine()) != null) {
                for (String letter : s.split("")) {
                    if (letter.equals(args[9])) {
                        c++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Letter : " + args[0] + " appears " + c + "times in data.txt file.");
    }
}

