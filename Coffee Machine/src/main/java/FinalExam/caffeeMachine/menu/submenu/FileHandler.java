package FinalExam.caffeeMachine.menu.submenu;

import java.io.*;

public class FileHandler {

    public static void file(String filename, String caffee) {

        try {


            PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("./src/main/resources/" + filename)));

            out1.println(caffee);

            out1.close();
        } catch (EOFException e) {
            System.err.println("End of stream");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
