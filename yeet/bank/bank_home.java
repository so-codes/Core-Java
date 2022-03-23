package yeet.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bank_home extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2;

    bank_home() {

        l1 = new JLabel("Welcome to the Bank of Yeet!");
        l2 = new JLabel("Please select an option");

        b1 = new JButton("Login");
        b2 = new JButton("Register");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(l1);
        add(l2);
        add(b1);
        add(b2);

        setTitle("Bank thingy");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {

        if (criz.getSource() == b1) {
            new login();
            dispose();
        }

        if (criz.getSource() == b2) {
            new register();
            dispose();
        }

    }

    public static void main(String[] args) {
        new bank_home();
    }
}
