package ex1;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame implements Observer {
    JTextField text;

    public Interface() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(360, 300);
        setLayout(new GridLayout(1,3));
        this.text = new JTextField("");
        this.add(text);
        setVisible(true);
    }


    public void update(Object event) {
    text.setText(" temperature from sensor is "+event.toString());
    }
}
