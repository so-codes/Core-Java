package base.app;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class key_app extends JFrame implements KeyListener {
    // public class key_app extends KeyAdapter -- to only handle selective events

    JLabel l1, l2;
    JTextField t1;
    JButton b1;
    JFrame f1;

    key_app() {

        l1 = new JLabel("Enter something:");
        t1 = new JTextField(20);
        b1 = new JButton("OK");
        l2 = new JLabel("");

        add(l1); // f1.add(l1);
        add(t1); // f1.add(t1);
        add(b1); // f1.add(b1);
        add(l2); // f1.add(l2);

        setTitle("Criz page");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1.addKeyListener(this);
        b1.addKeyListener(this);

    }

    public void keyTyped(KeyEvent e) {
        l2.setText("Key typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        l2.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l2.setText("Key released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new key_app();
    }

}
