package base.app;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class product_bill extends JFrame implements ActionListener {

    int sum = 0;
    JComboBox<String> cb;
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2;

    product_bill() {

        l1 = new JLabel("Select your product: ");
        l2 = new JLabel("Enter the quantity: ");
        l3 = new JLabel();
        t1 = new JTextField(15);
        b1 = new JButton("Calculate");
        b2 = new JButton("Reset");

        cb = new JComboBox<String>();
        cb.addItem("Pen");
        cb.addItem("Needle");
        cb.addItem("Paper");
        cb.addItem("Eraser");

        add(l1);
        add(cb);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
        add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        cb.addActionListener(this);

        setTitle("Product Bill");
        setSize(350, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if(criz.getSource() == b1){
            int qty = Integer.parseInt(t1.getText());
            if(cb.getSelectedItem().equals("Pen")){
                sum = qty * 10;
                l3.setText("You bought " + qty + " Pen(s) for Rs " + sum);
            }
            else if(cb.getSelectedItem().equals("Paper")){
                sum = qty * 20;
                l3.setText("You bought " + qty + " Paper(s) for Rs" + sum);
            }
            else if(cb.getSelectedItem().equals("Needle")){
                sum = qty * 30;
                l3.setText("You bought " + qty + " Needle(s) for Rs " + sum);
            }
            else if(cb.getSelectedItem().equals("Eraser")){
                sum = qty * 40;
                l3.setText("You bought " + qty + " Eraser(s) for Rs " + sum);
            }
        }
        else if(criz.getSource() == b2){
            cb.setSelectedIndex(0);
            t1.setText("");
            l3.setText("");
        }
    }

    public static void main(String[] args) {
        new product_bill();
    }
    
}
