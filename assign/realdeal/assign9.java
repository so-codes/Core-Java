package assign.realdeal;

import java.awt.event.*;
import javax.swing.*;

public class assign9 extends JFrame implements ActionListener {

    JLabel select, seats, type, payment, ans, end;
    JTextField t1;

    JComboBox<String> c1;
    JRadioButton silver, gold, plat, box;
    JRadioButton UPI, card, net;

    JButton book, reset;

    String movie[] = { "Iron Man", "Crizmo", "Poggers", "Spiderman", "all man movies" };

    assign9() {

        select = new JLabel("Select Movie");
        seats = new JLabel("No. of seats");
        type = new JLabel("Select type");
        payment = new JLabel("Payment Mode");
        ans = new JLabel("");
        end = new JLabel("");

        t1 = new JTextField(10);

        c1 = new JComboBox<String>(movie);

        silver = new JRadioButton("Silver");
        gold = new JRadioButton("Gold");
        plat = new JRadioButton("Platinum");
        box = new JRadioButton("Box");

        UPI = new JRadioButton("UPI");
        card = new JRadioButton("Card");
        net = new JRadioButton("Net Banking");

        book = new JButton("Book");
        reset = new JButton("Reset");

        select.setBounds(10, 10, 100, 30);
        c1.setBounds(120, 10, 100, 30);
        seats.setBounds(10, 50, 100, 30);
        t1.setBounds(120, 50, 100, 30);
        type.setBounds(10, 100, 100, 30);
        silver.setBounds(120, 100, 100, 30);
        gold.setBounds(120, 130, 100, 30);
        plat.setBounds(120, 160, 100, 30);
        box.setBounds(120, 190, 100, 30);
        payment.setBounds(10, 230, 100, 30);
        UPI.setBounds(120, 230, 100, 30);
        card.setBounds(120, 260, 100, 30);
        net.setBounds(120, 290, 100, 30);
        book.setBounds(10, 330, 100, 30);
        reset.setBounds(120, 330, 100, 30);
        ans.setBounds(40, 370, 300, 30);

        add(select);
        add(c1);
        add(seats);
        add(t1);
        add(type);
        add(silver);
        add(gold);
        add(plat);
        add(box);
        add(payment);
        add(UPI);
        add(card);
        add(net);
        add(book);
        add(reset);
        add(ans);
        add(end);

        silver.addActionListener(this);
        gold.addActionListener(this);
        plat.addActionListener(this);
        box.addActionListener(this);
        UPI.addActionListener(this);
        card.addActionListener(this);
        net.addActionListener(this);
        book.addActionListener(this);
        reset.addActionListener(this);

        setTitle("Tickets");
        setSize(250, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {

        int price = 0;
        if (criz.getSource() == silver) {
            price = price + 100;
            ans.setText("Total amount to be paid is " + price);
        }
        if (criz.getSource() == gold) {
            price = price + 200;
            ans.setText("Total amount to be paid is " + price);
        }
        if (criz.getSource() == plat) {
            price = price + 300;
            ans.setText("Total amount to be paid is " + price);
        }
        if (criz.getSource() == box) {
            price = price + 400;
            ans.setText("Total amount to be paid is " + price);
        }
        if (criz.getSource() == UPI) {
            ans.setText("UPI payment is selected");
        }
        if (criz.getSource() == card) {
            ans.setText("Card payment is selected");
        }
        if (criz.getSource() == net) {
            ans.setText("Net banking is selected");
        }
        if (criz.getSource() == book) {
            ans.setText("Ticket booked successfully");
        } else if (criz.getSource() == reset) {
            t1.setText("");
            ans.setText("");
            silver.setSelected(false);
            gold.setSelected(false);
            plat.setSelected(false);
            box.setSelected(false);
            UPI.setSelected(false);
            card.setSelected(false);
            net.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new assign9();
    }

}
