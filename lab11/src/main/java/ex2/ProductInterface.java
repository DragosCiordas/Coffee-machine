package ex2;

import javax.swing.*;

public class ProductInterface {
    private JPanel pannel;
    private JTextField namefield;
    private JTextField quantityfield;
    private JTextField pricefield;
    private JButton ADDNEWPRODUCTButton;
    private JList list1;
    private JTextField updatefield;
    private JButton UPDATEQUANTITYButton;
    private JButton delete;

    public JPanel getPannel() {
        return pannel;
    }

    public JTextField getNamefield() {
        return namefield;
    }

    public JTextField getQuantityfield() {
        return quantityfield;
    }

    public JTextField getPricefield() {
        return pricefield;
    }

    public JButton getADDNEWPRODUCTButton() {
        return ADDNEWPRODUCTButton;
    }

    public JList getList1() {
        return list1;
    }

    public JTextField getUpdatefield() {
        return updatefield;
    }

    public JButton getUPDATEQUANTITYButton() {
        return UPDATEQUANTITYButton;
    }

    public JButton getDelete() {
        return delete;
    }
}
