package ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

 class FileReader {
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JTextArea textArea1;



    public FileReader() throws IOException {
        textField1.setText("ex3.txt");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    textArea1.setText(Files.readString(Paths.get(textField1.getText())));}
                catch(IOException ioException){
                    JOptionPane.showMessageDialog(null,"File not found");
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"DONE");
            }
        });

    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("FileReader");
        frame.setContentPane(new FileReader().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        File file1 =new File("ex3.txt");
        FileWriter fw = new FileWriter(file1);
        PrintWriter pw= new PrintWriter(fw);
        pw.write("miau");
        pw.write("bmw");
        pw.close();
    }
}
