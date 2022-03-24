package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class product_app extends JFrame implements ActionListener {
    int sum = 0;
    JComboBox<String> cb1;
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2;

    product_app() {

        l1 = new JLabel("Select Fav food");
        l2 = new JLabel("Enter the quantity: ");
        l3 = new JLabel();
        t1 = new JTextField(10);
        b1 = new JButton("Calculate");
        b2 = new JButton("Reset");

        cb1 = new JComboBox<String>();
        cb1.addItem("Pen");
        cb1.addItem("Paper");
        cb1.addItem("Needle");
        cb1.addItem("Eraser");

        add(l1);
        add(cb1);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
        add(l3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        cb1.addActionListener(this);

        setSize(200, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        String scr = (String) cb1.getSelectedItem();
        int a = Integer.parseInt(t1.getText());

        if (ae.getSource() == b1) {
            if (scr.equals("Pen")) {
                sum = a * 10;
            } else if (scr.equals("Paper")) {
                sum = a * 6;
            } else if (scr.equals("Needle")) {
                sum = a * 8;
            } else {
                sum = a * 3;
            }

        }
        l3.setText("Your Total bill is " + sum);
        if (ae.getSource() == b2) {
            t1.setText("");
            l3.setText("");
        }

    }

    public static void main(String[] args) {
        new product_app();
    }
}
