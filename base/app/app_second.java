package base.app;

import javax.swing.*;
import java.awt.*;

public class app_second extends JFrame {

    JLabel l1;
    JTextField t1;
    app_second() {

        l1 = new JLabel("Enter Name: ");
        t1 = new JTextField(10);
        add(l1);
        add(t1);

        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new app_second();
    }
    
}
