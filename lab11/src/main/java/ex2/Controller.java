package ex2;

import javax.swing.*;
import java.util.Vector;

public class Controller {
    public static Vector<Product> products = new Vector<>(0);

    public static void main(String[] args) {
        JFrame ok = new JFrame("Stock Manager");
        ProductInterface inter = new ProductInterface();
        inter.getADDNEWPRODUCTButton().addActionListener(e -> {
            String name = inter.getNamefield().getText();
            int quantity = Integer.parseInt(inter.getQuantityfield().getText());
            double price = Double.parseDouble(inter.getPricefield().getText());
            products.add(new Product(name, price, quantity));
            inter.getList1().setListData(products);
        });

        inter.getDelete().addActionListener(e -> {
            products.remove(inter.getList1().getSelectedValue());
            inter.getList1().setListData(products);
        });

        inter.getUPDATEQUANTITYButton().addActionListener(e -> {
            products.get(inter.getList1().getSelectedIndex()).setQuantity(Integer.parseInt(inter.getUpdatefield().getText()));
            inter.getList1().setListData(products);

        });

        ok.setContentPane(inter.getPannel());
        ok.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ok.pack();
        ok.setVisible(true);
    }
}
