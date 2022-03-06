package ex4;


import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dictionary d = new Dictionary();
        boolean w = true;

        while (w) {
            System.out.println(
                            '\n' + "0. Exit" +
                            '\n' + "1. Define word" +
                            '\n' + "2. Definition for word " +
                            '\n' + "3. Get ALL words "+
                            '\n' + "4. Get ALL definitions ");
            int c = scanner.nextInt();

            switch (c) {
                case 1: {


                    System.out.println("Enter a word ");
                    String word0 = scanner.next();
                    Word word = new Word(word0);

                    System.out.println("Enter the definition for the word above");
                    String definition0 = scanner.next();
                    Definition definition = new Definition(definition0);
                    d.addWord(word, definition);

                    break;
                }

                case 2: {
                    System.out.println("Enter a word");
                    String word1 = scanner.next();
                    Word word = new Word(word1);
                    System.out.println(d.getDefinition(word));

                    break;
                }


                case 3: {

                    System.out.println(d.getAllWords());
                    break;
                }
                case 4:{
                    System.out.println(d.getAllDefinitions());
                    break;}

                case 0: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}