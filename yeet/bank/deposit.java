package yeet.bank;

import javax.swing.*;
import java.awt.event.*;

public class deposit {

    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;

    deposit() {

        f = new JFrame("Deposit");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Deposit");
        l2 = new JLabel("Amount: ");

        l3 = new JLabel("");
        t2 = new JTextField(10);

        b1 = new JButton("Deposit");

        l1.setBounds(50, 50, 100, 30);
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
                // String account = t1.getText();
                String amount = t2.getText();
                if (amount.equals("")) {
                    l3.setText("Please enter an account and amount");
                } else {
                    l3.setText("Deposited " + amount);
                }
            }
        });

    }

    public int poggie(int bal) {
        return bal;
    }

}
