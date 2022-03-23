package base.app.mix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class app1 extends JFrame implements ActionListener {

    JButton b1;

    app1() {

        b1 = new JButton("Add");
        b1.addActionListener(this);
        add(b1);

        setTitle("File App");
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {

        if (criz.getSource() == b1) {
            new app2();
            dispose();
        }

    }

    public static void main(String[] args) {
        new app1();
    }
}
