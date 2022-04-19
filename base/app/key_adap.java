package base.app;

import javax.swing.*;
import java.awt.event.*;

public class key_adap extends KeyAdapter {

    JLabel l1;
    JTextField area;
    JFrame f1;

    key_adap() {
        f1 = new JFrame();
        l1 = new JLabel("");
        l1.setBounds(20, 50, 200, 30);
        area = new JTextField(50);
        area.setBounds(20, 80, 200, 30);
        area.addKeyListener(this);

        f1.add(l1);
        f1.add(area);
        f1.setSize(300, 300);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Key typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l1.setText("Key released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new key_adap();
    }

}
