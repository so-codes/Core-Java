package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class webpage extends JFrame implements ActionListener {

    JLabel L1, L2, L3, L4, L5;
    JLabel an1, an2, an3, an4, an5;
    JTextField T1, T2;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3, c4;
    JComboBox cb1;
    ButtonGroup bg;
    JButton B1, B2, B3, B4;

    webpage() {

        L1 = new JLabel("First-Name:");
        L2 = new JLabel("Mobile No: ");
        an1 = new JLabel("");

        T1 = new JTextField(7);
        T2 = new JTextField(7);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        L3 = new JLabel("What is your Gender : ");
        an2 = new JLabel("");
        bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);

        c1 = new JCheckBox("English");
        c2 = new JCheckBox("Hindi");
        c3 = new JCheckBox("Others");

        L4 = new JLabel("Lang-Known: ");
        an3 = new JLabel("");

        L5 = new JLabel("Select Your Qualification: ");
        an4 = new JLabel("");
        cb1 = new JComboBox();

        an5 = new JLabel("");

        cb1.addItem("Select One");
        cb1.addItem("BBA");
        cb1.addItem("BCA");
        cb1.addItem("MBA");
        cb1.addItem("MCA");
        cb1.addItem("B.Tech");

        B1 = new JButton("Login");
        B2 = new JButton("Reset");
        B3 = new JButton("Exit");
        B4 = new JButton("Register");

        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(L3);
        add(r1);
        add(r2);
        add(L4);
        add(c1);
        add(c2);
        add(c3);
        add(L5);
        add(cb1);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(an1);
        add(an2);
        add(an3);
        add(an4);
        add(an5);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        cb1.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);

        setTitle("Criz page");
        setSize(324, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {

        if (criz.getSource() == B1) {
            if (T1.getText().equals("admin") && T2.getText().equals("admin")) {
                an5.setText("Login Successful");
            } else {
                an5.setText("Login Failed");
            }
        }

        if (criz.getSource() == r1) {
            an2.setText("User is Male");
        }

        if (criz.getSource() == r2) {
            an2.setText("User is Female");
        }

        if (criz.getSource() == c1) {
            if (c1.isSelected()) {
                an3.setText("User selected English");
            } else {
                an3.setText("User did not select English");
            }
        }

        if (criz.getSource() == c2) {
            if (c2.isSelected()) {
                an3.setText("User selected Hindi");
            } else {
                an3.setText("User did not select Hindi");
            }
        }

        if (criz.getSource() == c3) {
            if (c3.isSelected()) {
                an3.setText("User selected Other");
            } else {
                an3.setText("User did not select Other");
            }
        }

        if (criz.getSource() == cb1) {
            an4.setText("User selected " + cb1.getSelectedItem());
        }

        if (criz.getSource() == B2) {
            T1.setText("");
            T2.setText("");

            r1.setSelected(false);
            r2.setSelected(false);

            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);

            cb1.setSelectedIndex(0);

            an1.setText("");
            an2.setText("");
            an3.setText("");
            an4.setText("");
            an5.setText("Reset Successful");
        }

        if (criz.getSource() == B3) {
            System.exit(0);
        }
        if (criz.getSource() == B4) {
            if (T1.getText().equals("admin") && T2.getText().equals("admin")) {
                JOptionPane.showMessageDialog(null, "Register Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        }

    }

    public static void main(String[] args) {
        new webpage();
    }

}