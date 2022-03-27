package assign.realdeal;

import javax.swing.*;
import java.awt.event.*;

public class assign1 extends JFrame implements ActionListener {
    JCheckBox sau, oli;
    JRadioButton veg, small, med;
    ButtonGroup bg1, bg2;

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4;

    JButton price, clear, exit;

    assign1() {

        l1 = new JLabel("Enter your name ");
        t1 = new JTextField(10);
        l1.setBounds(10, 10, 100, 30);
        t1.setBounds(120, 10, 150, 30);

        l2 = new JLabel("TYPE: ");
        veg = new JRadioButton("Vegetarian");
        l2.setBounds(10, 50, 100, 30);
        veg.setBounds(120, 50, 100, 30);

        l3 = new JLabel("SIZE: ");
        small = new JRadioButton("Small");
        med = new JRadioButton("Medium");
        l3.setBounds(10, 100, 100, 30);
        small.setBounds(120, 100, 80, 30);
        med.setBounds(200, 100, 100, 30);

        bg1 = new ButtonGroup();
        bg1.add(veg);

        bg2 = new ButtonGroup();
        bg2.add(small);
        bg2.add(med);

        l4 = new JLabel("Toppings");
        sau = new JCheckBox("Sausage");
        oli = new JCheckBox("Olives");
        l4.setBounds(10, 150, 100, 30);
        sau.setBounds(120, 150, 80, 30);
        oli.setBounds(200, 150, 100, 30);

        l5 = new JLabel("Enter Quantity: ");
        t2 = new JTextField(10);
        l5.setBounds(10, 200, 100, 30);
        t2.setBounds(120, 200, 150, 30);

        price = new JButton("Price");
        t3 = new JTextField(10);
        price.setBounds(10, 240, 100, 30);
        t3.setBounds(120, 240, 150, 30);

        clear = new JButton("Clear");
        exit = new JButton("Exit");
        clear.setBounds(10, 290, 120, 30);
        exit.setBounds(140, 290, 120, 30);

        l6 = new JLabel("Bills ");
        t4 = new JTextField(10);
        l6.setBounds(10, 330, 100, 30);
        t4.setBounds(120, 330, 150, 30);

        price.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);
        sau.addActionListener(this);
        oli.addActionListener(this);
        veg.addActionListener(this);
        small.addActionListener(this);
        med.addActionListener(this);

        l7 = new JLabel("");

        add(l1);
        add(t1);
        add(l2);
        add(veg);
        add(l3);
        add(small);
        add(med);
        add(l4);
        add(sau);
        add(oli);
        add(l5);
        add(t2);
        add(price);
        add(t3);
        add(clear);
        add(exit);
        add(l6);
        add(t4);
        add(l7);

        setTitle("Pizza 👉👈");
        setSize(300, 450);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == price) {
            int Quantity = Integer.parseInt(t2.getText());
            double price = 0;

            if (veg.isSelected()) {
                price = price + 100 * Quantity;
            }
            if (small.isSelected()) {
                price = price + 150 * Quantity;
            }
            if (med.isSelected()) {
                price = price + 200 * Quantity;
            }
            if (sau.isSelected()) {
                price = price + 50 * Quantity;
            }
            if (oli.isSelected()) {
                price = price + 30 * Quantity;
            }
            t3.setText("" + price);
            t4.setText("Total Bill = " + price);
        }

        if (criz.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            veg.setSelected(false);
            small.setSelected(false);
            med.setSelected(false);
            sau.setSelected(false);
            oli.setSelected(false);
        }
        if (criz.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new assign1();
    }

}
