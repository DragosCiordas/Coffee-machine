package ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    private JPanel panel;
    private JTextField textField1;
    private JButton inc;
    private JButton rs;
    private int c = 0;

    public Counter() {

        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++c;
                textField1.setText(String.valueOf(c));
            }

        });

        rs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("0");
                c = 0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setContentPane(new Counter().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }


}
