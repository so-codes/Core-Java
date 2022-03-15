package practicals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pr35_app extends JFrame implements ActionListener {

    JLabel l1, l2;
    JRadioButton rb1, rb2, rb3;
    JTextField t1;
    Font f1, f2, f3;

    pr35_app() {
        l1 = new JLabel("ENTER ANY TEXT TO CHANGE IT INTO BOLD, ITALICS OR NORMAL:");
        l2 = new JLabel("");

        t1 = new JTextField(10);

        rb1 = new JRadioButton("BOLD");
        rb2 = new JRadioButton("ITALICS");
        rb3 = new JRadioButton("NORMAL");

        f1 = new Font("Lucida Calligraphy", Font.BOLD, 25);
        f2 = new Font("Lucida Handwriting", Font.ITALIC, 25);
        f3 = new Font("Lucida Calligraphy", Font.PLAIN, 25);

        ButtonGroup bg = new ButtonGroup();

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(l1);
        add(t1);
        add(rb1);
        add(rb2);
        add(rb3);
        add(l2);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        setSize(500, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("TEXT FORMATTING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        // String s=t1.getText();
        if (ae.getSource() == rb1) {
            t1.setFont(f1);
            // t1.setForeground(Color.blue);
        } else if (ae.getSource() == rb2) {
            t1.setFont(f2);
            // t1.setForeground(Color.blue);
        } else {
            t1.setFont(f3);
            // t1.setForeground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new pr35_app();
    }
}
