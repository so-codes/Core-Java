package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox extends JFrame implements ItemListener {
    
    JCheckBox c1 , c2;
    JLabel l1 , l2;

    checkbox() {
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("C++");
        l1 = new JLabel("Select one: ");
        l2 = new JLabel("");

        add(l1);
        add(c1);
        add(c2);
        add(l2);

        c1.addItemListener(this);
        c2.addItemListener(this);

        setTitle("Checkbox");
        setSize(370, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            if (c1.isSelected()) {
                l2.setText("Java is selected");
            } else {
                l2.setText("Java is not selected");
            }
        }
        if (e.getSource() == c2) {
            if (c2.isSelected()) {
                l2.setText("C++ is selected");
            } else {
                l2.setText("C++ is not selected");
            }
        }
    }

    public static void main(String[] args) {
        new checkbox();
    }
}
