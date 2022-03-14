package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// make a app using JComboBox
public class comboBox extends JFrame implements ActionListener{

    JComboBox c1;
    JLabel l1, l2;

    comboBox() {

        l1 = new JLabel("Select fav food: ");
        l2 = new JLabel("");
        c1 = new JComboBox();

        c1.addItem("Pizza");
        c1.addItem("Burger");
        c1.addItem("Pasta");
        c1.addItem("Noodles");
        c1.addItem("Sandwich");

        add(l1);
        add(c1);
        add(l2);

        c1.addActionListener(this);

        setTitle("ComboBox");
        setSize(250, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == c1) {
            l2.setText("User selected " + c1.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new comboBox();
    }
}
    
