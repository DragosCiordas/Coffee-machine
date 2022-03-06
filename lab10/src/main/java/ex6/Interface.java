package ex6;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    JTextField txt = new JTextField();
    volatile boolean starter = false;
    volatile int nr;

    public Interface() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLayout(new GridLayout(1, 3));
        JButton start = new JButton("Start/Stop");
        JButton reset = new JButton("Reset");
        start.addActionListener(e -> {
            synchronized (Interface.this) {
                notify();
                Interface.this.starter = !Interface.this.starter;
            }

        });

        reset.addActionListener(e -> {

            Interface.this.nr = 0;
            txt.setText(nr + "");

        });

        this.add(txt);
        this.add(reset);
        this.add(start);
        this.setVisible(true);

    }
}
