package assign.realdeal;

import java.awt.event.*;
import javax.swing.*;

public class assign8 extends JFrame implements ActionListener {

    JLabel currency, amount, result, fin;
    JTextField t1, t2, t3, t4;
    JComboBox<String> c1, c2;
    JButton compute, clear;

    String from[] = { "US Dollars", "Euro", "Pounds", "Yen", "Rupees" };
    String to[] = { "US Dollars", "Euro", "Pounds", "Yen", "Rupees" };

    assign8() {

        currency = new JLabel("Currency Converter");
        amount = new JLabel("Enter Amount");
        result = new JLabel("Converted");
        fin = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        c1 = new JComboBox<String>(from);
        c2 = new JComboBox<String>(to);

        compute = new JButton("Convert");
        clear = new JButton("Clear");

        currency.setBounds(130, 10, 300, 30);
        amount.setBounds(10, 50, 100, 30);
        t1.setBounds(120, 50, 100, 30);
        c1.setBounds(230, 50, 100, 30);
        result.setBounds(10, 100, 100, 30);
        t2.setBounds(120, 100, 100, 30);
        c2.setBounds(230, 100, 100, 30);
        compute.setBounds(10, 150, 100, 30);
        clear.setBounds(120, 150, 100, 30);
        fin.setBounds(10, 200, 300, 30);

        add(currency);
        add(amount);
        add(t1);
        add(c1);
        add(result);
        add(t2);
        add(c2);
        add(compute);
        add(clear);
        add(fin);

        compute.addActionListener(this);
        clear.addActionListener(this);

        setTitle("Currency Converter");
        setSize(400, 270);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {

        double amt = Double.parseDouble(t1.getText());
        double result = 0;

        // add listener for buttons
        if (criz.getSource() == compute) {
            if (c1.getSelectedItem().equals("US Dollars") && c2.getSelectedItem().equals("Euro")) {
                result = amt * 0.9;
            } else if (c1.getSelectedItem().equals("US Dollars") && c2.getSelectedItem().equals("Pounds")) {
                result = amt * 0.8;
            } else if (c1.getSelectedItem().equals("US Dollars") && c2.getSelectedItem().equals("Yen")) {
                result = amt * 110.25;
            } else if (c1.getSelectedItem().equals("US Dollars") && c2.getSelectedItem().equals("Rupees")) {
                result = amt * 68.25;
            } else if (c1.getSelectedItem().equals("Euro") && c2.getSelectedItem().equals("US Dollars")) {
                result = amt * 1.1;
            } else if (c1.getSelectedItem().equals("Euro") && c2.getSelectedItem().equals("Pounds")) {
                result = amt * 0.8;
            } else if (c1.getSelectedItem().equals("Euro") && c2.getSelectedItem().equals("Yen")) {
                result = amt * 125.25;
            } else if (c1.getSelectedItem().equals("Euro") && c2.getSelectedItem().equals("Rupees")) {
                result = amt * 71.25;
            } else if (c1.getSelectedItem().equals("Pounds") && c2.getSelectedItem().equals("US Dollars")) {
                result = amt * 1.2;
            } else if (c1.getSelectedItem().equals("Pounds") && c2.getSelectedItem().equals("Euro")) {
                result = amt * 1.1;
            } else if (c1.getSelectedItem().equals("Pounds") && c2.getSelectedItem().equals("Yen")) {
                result = amt * 132.25;
            } else if (c1.getSelectedItem().equals("Pounds") && c2.getSelectedItem().equals("Rupees")) {
                result = amt * 75.25;
            } else if (c1.getSelectedItem().equals("Yen") && c2.getSelectedItem().equals("US Dollars")) {
                result = amt * 0.0089;
            } else if (c1.getSelectedItem().equals("Yen") && c2.getSelectedItem().equals("Euro")) {
                result = amt * 0.0077;
            } else if (c1.getSelectedItem().equals("Yen") && c2.getSelectedItem().equals("Pounds")) {
                result = amt * 0.0071;
            } else if (c1.getSelectedItem().equals("Yen") && c2.getSelectedItem().equals("Rupees")) {
                result = amt * 0.59;
            } else if (c1.getSelectedItem().equals("Rupees") && c2.getSelectedItem().equals("US Dollars")) {
                result = amt * 0.01;
            } else if (c1.getSelectedItem().equals("Rupees") && c2.getSelectedItem().equals("Euro")) {
                result = amt * 0.0089;
            } else if (c1.getSelectedItem().equals("Rupees") && c2.getSelectedItem().equals("Pounds")) {
                result = amt * 0.0071;
            } else if (c1.getSelectedItem().equals("Rupees") && c2.getSelectedItem().equals("Yen")) {
                result = amt * 0.59;
            }
            t2.setText(String.valueOf(result));
        }
        if (criz.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            fin.setText("");
        }

    }

    public static void main(String args[]) {
        new assign8();
    }

}
