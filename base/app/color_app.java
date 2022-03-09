package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class color_app extends JFrame implements ActionListener {

    JLabel L1 , L2 ;
    JTextField T1 ;
    JButton B1 , B2;

    color_app() {
        L1 = new JLabel("Enter your name : ");
        L2 = new JLabel("");
        T1 = new JTextField(20);
        B1 = new JButton("Display Red");
        B2 = new JButton("Display Blue");

        add(L1);
        add(T1);
        add(B1);
        add(B2);
        add(L2);

        B1.addActionListener(this);
        B2.addActionListener(this);

        setTitle("Welcome");
        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == B1) {
            L2.setForeground(Color.red);
            L2.setText("Hello " + T1.getText());
        } 
        else if(e.getSource() == B2) {
            L2.setForeground(Color.blue);
            L2.setText("Hello " + T1.getText());
        } 
    }

    public static void main(String[] args) {
        new color_app();
    } 
    
}
