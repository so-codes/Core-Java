package yeet.bank;

import javax.swing.*;
import java.awt.event.*;

public class login {

    JFrame f;

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;

    login() {

        f = new JFrame("Login");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Account: ");
        l2 = new JLabel("password: ");

        l3 = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b1 = new JButton("Login");

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

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().equals("admin") && t2.getText().equals("admin")) {
                    new bank_functions();
                    f.dispose();
                } else {
                    l3.setText("Login Failed");
                }
            }
        });
    }
}