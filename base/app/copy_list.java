package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class copy_list extends JFrame implements ActionListener {
    JList<String> l1, l2;
    JButton b1;
    String color[] = { "red", "green", "yellow", "white", "black" };

    copy_list() {
        l1 = new JList<String>(color);
        l2 = new JList<String>();

        l1.setVisibleRowCount(7);
        l2.setVisibleRowCount(7);

        b1 = new JButton("copy");

        add(new JScrollPane(l1));
        add(new JScrollPane(l2));
        add(b1);

        b1.addActionListener(this);

        setTitle("Jlist");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            // copy list elements
            // l2.setListData(l1.getSelectedValues());
        }
    }

    public static void main(String[] args) {
        new copy_list();
    }
}
