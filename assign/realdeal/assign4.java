package assign.realdeal;

import javax.swing.*;
import java.awt.event.*;

public class assign4 extends JFrame implements ActionListener {

    JLabel product, storage, tools, billval;

    JComboBox<String> type;
    JCheckBox lan, con;
    JRadioButton wired, wireless;
    JButton bill;

    JList<String> prod;

    assign4() {

        String[] sp = { "Notepad", "Folder", "Pen" };

        product = new JLabel("Choose products");
        prod = new JList<String>(sp);

        prod.add(product);

        storage = new JLabel("Choose Storage Type");
        type = new JComboBox<String>();
        type.addItem("Select-Item");
        type.addItem("Pen-Drive");
        type.addItem("HDD");
        type.addItem("SSD");

        tools = new JLabel("Choose tools");
        lan = new JCheckBox("LAN");
        con = new JCheckBox("RJ45 Connectors");
        wired = new JRadioButton("Traditional Mouse");
        wireless = new JRadioButton("Wireless Mouse");

        ButtonGroup bg = new ButtonGroup();
        bg.add(wired);
        bg.add(wireless);

        bill = new JButton("Calculate Bill");
        billval = new JLabel("");

        product.setBounds(10, 10, 100, 30);
        prod.setBounds(120, 10, 300, 50);

        storage.setBounds(10, 70, 200, 20);
        type.setBounds(150, 70, 200, 20);

        tools.setBounds(10, 100, 100, 30);
        lan.setBounds(120, 100, 200, 30);
        con.setBounds(120, 120, 200, 30);

        wired.setBounds(120, 150, 300, 30);
        wireless.setBounds(120, 170, 300, 30);

        bill.setBounds(10, 230, 150, 50);
        billval.setBounds(200, 230, 300, 50);

        type.addActionListener(this);
        bill.addActionListener(this);

        add(product);
        add(prod);
        add(storage);
        add(type);
        add(tools);
        add(lan);
        add(con);
        add(wired);
        add(wireless);
        add(bill);
        add(billval);

        setTitle("Billing Application");
        setSize(370, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        int price = 0;
        if (criz.getSource() == bill) {
            if (prod.getSelectedValue() == "Notepad") {
                price = price + 100;
            } else if (prod.getSelectedValue() == "Folder") {
                price = price + 200;
            } else if (prod.getSelectedValue() == "Pen") {
                price = price + 300;
            }
            if (type.getSelectedItem() == "Select-Item") {
                price = price + 0;
            } else if (type.getSelectedItem() == "Pen-Drive") {
                price = price + 100;
            } else if (type.getSelectedItem() == "HDD") {
                price = price + 200;
            } else if (type.getSelectedItem() == "SSD") {
                price = price + 300;
            }
            if (lan.isSelected()) {
                price = price + 100;
            }
            if (con.isSelected()) {
                price = price + 100;
            }
            if (wired.isSelected()) {
                price = price + 100;
            }
            if (wireless.isSelected()) {
                price = price + 200;
            }
            billval.setText("" + price);
        }
    }

    public static void main(String[] args) {
        new assign4();
    }

}
