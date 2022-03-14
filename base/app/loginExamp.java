package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class loginExamp extends JFrame implements ActionListener{

    JLabel L1, L2, L3;
    JTextField T1, T2;
    JButton B1, B2, B3, B4, B5;
    loginExamp() {
        L1 = new JLabel("Enter Username : ");
        L2 = new JLabel("Enter Password : ");
        L3 = new JLabel("");

        T1 = new JTextField(20);
        T2 = new JTextField(20);

        B1 = new JButton("Login");
        B2 = new JButton("Reset");
        B3 = new JButton("Exit");
        B4 = new JButton("Register");
        B5 = new JButton("Forgot Password");

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
        setTitle("Login");
        setSize(370, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent eee) {
        if (eee.getSource() == B1) {
            if (T1.getText().equals("admin") && T2.getText().equals("admin")) {
                L3.setText("Login Successful");
            } else {
                L3.setText("Login Failed");
            }
        }
        if (eee.getSource() == B2) {
            T1.setText("");
            T2.setText("");
        }
        if (eee.getSource() == B3) {
            System.exit(0);
        }
        if(eee.getSource() == B4){
            JOptionPane.showMessageDialog(null, "Register Successful");
        }
    }

    public static void main(String[] args) {
        new loginExamp();
    }
    
}
