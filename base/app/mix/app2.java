package base.app.mix;

import javax.swing.*;
import java.awt.event.*;

public class app2 {

    JFrame f;

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    app2() {

        f = new JFrame("Addition");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Number 1: ");
        l2 = new JLabel("Number 2: ");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b1 = new JButton("Add");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 100, 30);
        b1.setBounds(150, 150, 100, 30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                JOptionPane.showMessageDialog(null, "Addition of " + a + " and " + b + " is " + c);
            }
        });
    }
}
