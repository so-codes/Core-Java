package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class font_app extends JFrame implements ActionListener {

    JLabel l1, l2;
    JRadioButton rb1, rb2, rb3;
    JTextField t1;
    Font f1, f2, f3;

    font_app() {
        l1 = new JLabel("Enter any text to change it into Bold , Italics or Plain:");
        l2 = new JLabel("");

        t1 = new JTextField(15);

        rb1 = new JRadioButton("Bold");
        rb2 = new JRadioButton("Italics");
        rb3 = new JRadioButton("Plain");

        f1 = new Font("Calligraphy", Font.BOLD, 13);
        f2 = new Font("Calligraphy", Font.ITALIC, 13);
        f3 = new Font("Calligraphy", Font.PLAIN, 13);

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

        setSize(470, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Text Font");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == rb1) {
            t1.setFont(f1);
            t1.setForeground(Color.blue);
        } else if (criz.getSource() == rb2) {
            t1.setFont(f2);
            t1.setForeground(Color.red);
        } else {
            t1.setFont(f3);
            t1.setForeground(Color.black);
        }
    }

    public static void main(String[] args) {
        new font_app();
    }

}
