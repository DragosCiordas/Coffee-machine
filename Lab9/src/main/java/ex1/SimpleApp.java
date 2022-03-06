package ex1;

import javax.swing.*;

public class SimpleApp extends JFrame {

    SimpleApp() {
        setTitle("Titlul ferestrei");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleApp a = new SimpleApp();
    }

}