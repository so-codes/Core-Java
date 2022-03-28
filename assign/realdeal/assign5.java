package assign.realdeal;

import java.awt.event.*;
import javax.swing.*;

public class assign5 extends JFrame implements ActionListener {

    JLabel operations, discount, total, findis, Netpay, background;
    JTextField costval, disval, netval;

    JCheckBox mango, white, oj, takeaway;
    JRadioButton none, five, ten;

    ButtonGroup  bg;
    JButton calculate, clear;

    assign5() {
        operations = new JLabel("Operations");
        discount = new JLabel("Discount");

        total = new JLabel("Total cost");
        findis = new JLabel("Discount");
        Netpay = new JLabel("Net Payable anount");

        mango = new JCheckBox("Mango Milkshake = 250");
        white = new JCheckBox("White Russian = 400");
        oj = new JCheckBox("Oj Simpson juice = 100");
        takeaway = new JCheckBox("Takeaway = 10");

        none = new JRadioButton("None");
        five = new JRadioButton("5%");
        ten = new JRadioButton("10%");
       
        // bg = new ButtonGroup();
        // bg.add(none);
        // bg.add(five);
        // bg.add(ten);

        calculate = new JButton("Calculate");
        clear = new JButton("Clear");

        costval = new JTextField(10);
        disval = new JTextField(10);
        netval = new JTextField(10);

        background = new JLabel("");

        operations.setBounds(10, 10, 100, 30);
        mango.setBounds(10, 50, 200, 30);
        white.setBounds(10, 80, 200, 30);
        oj.setBounds(10, 110, 200, 30);
        takeaway.setBounds(10, 140, 200, 30);

        discount.setBounds(450, 10, 100, 30);
        none.setBounds(450, 50, 200, 30);
        five.setBounds(450, 80, 200, 30);
        ten.setBounds(450, 110, 200, 30);

        total.setBounds(10, 200, 200, 30);
        findis.setBounds(10, 225, 200, 30);
        Netpay.setBounds(10, 250, 200, 30);

        calculate.setBounds(370, 150, 100, 30);
        clear.setBounds(500, 150, 100, 30);

        costval.setBounds(430, 200, 100, 30);
        disval.setBounds(430, 225, 100, 30);
        netval.setBounds(430, 250, 100, 30);

        calculate.addActionListener(this);
        clear.addActionListener(this);

        add(operations);
        add(mango);
        add(white);
        add(oj);
        add(takeaway);

        add(discount);
        add(none);
        add(five);
        add(ten);

        add(total);
        add(findis);
        add(Netpay);

        add(calculate);
        add(clear);

        add(costval);
        add(disval);
        add(netval);

        add(background);

        setTitle("Billing Application");
        setSize(670, 450);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent criz) {
        int price = 0;
        if (criz.getSource() == calculate) {
            if (mango.isSelected()) {
                price = price + 250;
            }
            if (white.isSelected()) {
                price = price + 400;
            }
            if (oj.isSelected()) {
                price = price + 100;
            }
            if (takeaway.isSelected()) {
                price = price + 10;
            }
            if (none.isSelected()) {
                price = price + 0;
            }
            if (five.isSelected()) {
                price = price + (price * 5) / 100;
            }
            if (ten.isSelected()) {
                price = price + (price * 10) / 100;
            }
            costval.setText(price + "");
            disval.setText((price * 10) / 100 + "");
            netval.setText((price - (price * 10) / 100) + "");
        }
        if (criz.getSource() == clear) {
            costval.setText("");
            disval.setText("");
            netval.setText("");
            mango.setSelected(false);
            white.setSelected(false);
            oj.setSelected(false);
            takeaway.setSelected(false);
            none.setSelected(false);
            five.setSelected(false);
            ten.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new assign5();
    }

}
