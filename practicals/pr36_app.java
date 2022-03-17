package practicals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pr36_app extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1;
    JTextField t1;

    pr36_app() {
        l1 = new JLabel("Enter meters: ");
        l2 = new JLabel("");

        t1 = new JTextField(10);
        b1 = new JButton("Convert into centimeters");

        add(l1);
        add(t1);
        add(b1);
        add(l2);

        b1.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Converter Thingy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == b1) {
            int a = Integer.parseInt(t1.getText());
            l2.setText(a * 100 + " cm");
            l2.setForeground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new pr36_app();
    }

}
