package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class option_pane extends JFrame implements ActionListener {

    JList<String> l1, l2;
    JRadioButton r1, r2;
    JButton b1;
    
    option_pane(){

        l1 = new JList<>();
        l2 = new JList<>();
        r1 = new JRadioButton("A");
        r2 = new JRadioButton("B");
        b1 = new JButton("OK");

        r1.addActionListener(this);
        r2.addActionListener(this);

        add(l1);
        add(r1);
        add(l2);
        add(r2);
        add(b1);

        setTitle("Criz page");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent criz) {

        if (criz.getSource() == r1) {
            System.out.println(" "+r1.getText());
            JOptionPane.showMessageDialog(null, "alert", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
        else if (criz.getSource() == r2) {
            System.out.println(" "+r2.getText());
            JOptionPane.showOptionDialog(null, "alert", "Invalid input", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, null, null);
        }
        else if (criz.getSource() == b1) {
            System.out.println(" "+b1.getText());
            JOptionPane.showMessageDialog(null, "alert", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        new option_pane();
    }
}
