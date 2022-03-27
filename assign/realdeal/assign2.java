package assign.realdeal;

import javax.swing.*;
import java.awt.event.*;

public class assign2 extends JFrame implements ActionListener {

    JLabel name, flavor, size, quantity, toppings, background;
    JTextField t1, t2, t3;
    JComboBox<String> flav;
    JCheckBox nuts, choco, cream;
    JButton amount, clear, exit;

    assign2() {

        name = new JLabel("name: ");
        t1 = new JTextField(10);
        name.setBounds(10, 10, 100, 30);
        t1.setBounds(120, 10, 300, 50);

        flavor = new JLabel("flavor: ");
        flav = new JComboBox<String>();
        flav.addItem("chocolate");
        flav.addItem("vanilla");
        flav.addItem("strawberry");
        flav.addItem("mint");
        flavor.setBounds(10, 70, 100, 30);
        flav.setBounds(120, 70, 200, 20);

        quantity = new JLabel("quantity: ");
        t2 = new JTextField(10);
        quantity.setBounds(10, 100, 100, 30);
        t2.setBounds(120, 100, 300, 50);

        toppings = new JLabel("toppings: ");
        nuts = new JCheckBox("nuts");
        choco = new JCheckBox("chocolate");
        cream = new JCheckBox("cream");

        toppings.setBounds(10, 150, 100, 30);
        nuts.setBounds(120, 150, 100, 30);
        choco.setBounds(120, 170, 100, 30);
        cream.setBounds(120, 190, 100, 30);

        amount = new JButton("amount");
        t3 = new JTextField(10);
        amount.setBounds(10, 230, 100, 50);
        t3.setBounds(120, 230, 300, 50);

        clear = new JButton("clear");
        exit = new JButton("exit");
        clear.setBounds(30, 300, 150, 50);
        exit.setBounds(250, 300, 150, 50);

        background = new JLabel("");

        add(name);
        add(t1);
        add(flavor);
        add(flav);
        add(quantity);
        add(t2);
        add(toppings);
        add(nuts);
        add(choco);
        add(cream);
        add(amount);
        add(t3);
        add(clear);
        add(exit);
        add(background);

        amount.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);
        nuts.addActionListener(this);
        choco.addActionListener(this);
        cream.addActionListener(this);
        flav.addActionListener(this);

        setTitle("Crizshop");
        setSize(500, 400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == amount) {

            String flavor = (String) flav.getSelectedItem();
            int quantity = Integer.parseInt(t2.getText());
            int price = 0;

            if (flavor.equals("chocolate")) {
                price = price + 100 * quantity;
            } else if (flavor.equals("vanilla")) {
                price = price + 150 * quantity;
            } else if (flavor.equals("strawberry")) {
                price = price + 200 * quantity;
            } else if (flavor.equals("mint")) {
                price = price + 250 * quantity;
            }
            if (nuts.isSelected()) {
                price += 10;
            }
            if (choco.isSelected()) {
                price += 10;
            }
            if (cream.isSelected()) {
                price += 10;
            }
            t3.setText(Integer.toString(price));
        }
        if (criz.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            nuts.setSelected(false);
            choco.setSelected(false);
            cream.setSelected(false);
            flav.setSelectedIndex(0);
        }
        if (criz.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new assign2();
    }

}
