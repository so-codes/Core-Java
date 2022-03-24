package yeet.bank;

import javax.swing.*;
import java.awt.event.*;

public class bank_functions implements ActionListener {

    JFrame f;

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3, b4;

    bank_functions() {

        f = new JFrame("Bank");
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Welcome to the Bank");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Enter balance: ");
        l2.setBounds(50, 100, 100, 30);

        t1 = new JTextField(10);

        f.add(l1);

        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Balance");
        b4 = new JButton("Logout");

        b1.setBounds(50, 100, 100, 30);
        b2.setBounds(150, 100, 100, 30);
        b3.setBounds(250, 100, 100, 30);
        b4.setBounds(350, 100, 100, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

    }

    public void actionPerformed(ActionEvent criz) {

        int bal = Integer.parseInt(t1.getText());

        if (criz.getSource() == b1) {
            deposit dep = new deposit();
            dep.poggie(bal);
            f.dispose();
        }

        if (criz.getSource() == b2) {
            new withdraw();
            f.dispose();
        }

        if (criz.getSource() == b3) {
            new balance();
            f.dispose();
        }

        if (criz.getSource() == b4) {
            new bank_home();
            f.dispose();
        }

    }

}
