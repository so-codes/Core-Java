package base.app;

import javax.swing.*;
import java.awt.*;

public class borderLayout extends JFrame {

    borderLayout() {

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        setLayout(new BorderLayout());
        setTitle("BorderLayout");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new borderLayout();
    }
}
