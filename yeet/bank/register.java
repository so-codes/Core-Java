package yeet.bank;

import javax.swing.*;
import java.awt.event.*;

public class register implements ActionListener {

    JFrame f;

    JLabel l1, l2, l3;
    JLabel l4, l5, l6;

    JTextField t1, t2;
    JTextField t3, t4;

    JButton b1;
    JButton b2;

    register() {

        f = new JFrame("register");
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Account: ");
        l2 = new JLabel("password: ");

        l3 = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b1 = new JButton("register");

        b1.addActionListener(this);

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 100, 30);
        b1.setBounds(150, 150, 100, 30);
        l3.setBounds(150, 200, 100, 30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(l3);

        l4 = new JLabel("Account: ");
        l5 = new JLabel("password: ");

        l6 = new JLabel("");

        t3 = new JTextField(10);
        t4 = new JTextField(10);

        b2 = new JButton("Login");

        b2.addActionListener(this);

        l4.setBounds(100, 100, 200, 60);
        t3.setBounds(100, 150, 200, 60);
        l5.setBounds(100, 200, 200, 60);
        t4.setBounds(100, 250, 200, 60);
        b2.setBounds(100, 300, 200, 60);
        l6.setBounds(100, 350, 200, 60);

        f.add(l4);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(b2);
        f.add(l6);
    }

    public void actionPerformed(ActionEvent e) {

        final String account = t1.getText();
        final String password = t2.getText();

        if (e.getSource() == b1) {
            if (account.equals("") || password.equals("")) {
                l3.setText("Please fill in all fields");
            } else {
                l3.setText("Account created");
            }
        }

        if (e.getSource() == b2) {
            if (t3.getText().equals(account) && t4.getText().equals(password)) {
                new bank_functions();
                f.dispose();
            } else {
                l6.setText("Login Failed");
            }
        }

    }
}
