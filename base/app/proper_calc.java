package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class proper_calc extends JFrame implements ActionListener {

    JLabel L1, L2, L3;
    JTextField T1, T2;
    JButton B1, B2, B3, B4, B5;

    proper_calc() {

        L1 = new JLabel("Enter NUM_1 : ");
        L2 = new JLabel("Enter NUM_2 : ");
        L3 = new JLabel("");
        T1 = new JTextField(20);
        T2 = new JTextField(20);
        B1 = new JButton("Add");
        B2 = new JButton("Substract");
        B3 = new JButton("Multiply");
        B4 = new JButton("Divide");
        B5 = new JButton("Reset");

        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(L3);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);

        setTitle("Calculator");
        setSize(370, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        double num1, num2;
        float result;

        if (e.getSource() == B1) {
            try {
                num1 = Double.parseDouble(T1.getText());
                num2 = Double.parseDouble(T2.getText());

                result = (float) (num1 + num2);
                L3.setText("Result : " + result);
                result = (float) (num1 + num2);
                L3.setText("Result is : " + result);
                L3.setForeground(Color.blue);

            } catch (Exception ex) {
                L3.setText("Invalid Input");
            }
        } else if (e.getSource() == B2) {
            try {
                num1 = Double.parseDouble(T1.getText());
                num2 = Double.parseDouble(T2.getText());

                result = (float) (num1 - num2);

                L3.setText("Result : " + result);

            } catch (Exception ex) {
                L3.setText("Invalid Input");
            }
        } else if (e.getSource() == B3) {
            try {
                num1 = Double.parseDouble(T1.getText());
                num2 = Double.parseDouble(T2.getText());

                result = (float) (num1 * num2);

                L3.setText("Result : " + result);

            } catch (Exception ex) {
                L3.setText("Invalid Input");
            }
        } else if (e.getSource() == B4) {
            try {
                num1 = Double.parseDouble(T1.getText());
                num2 = Double.parseDouble(T2.getText());

                result = (float) (num1 / num2);

                L3.setText("Result : " + result);

            } catch (Exception ex) {
                L3.setText("Invalid Input");
            }
        } else if (e.getSource() == B5) {
            T1.setText("");
            T2.setText("");
            L3.setText("");
        }
    }

    public static void main(String[] args) {
        new proper_calc();
    }

}
