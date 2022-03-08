package base.app;
import javax.swing.*;
import java.awt.*;

public class app_first extends JFrame {

    JLabel l1;
    app_first() {

        l1 = new JLabel("hello");
        add(l1);

        setSize(200,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Poggers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        new app_first();
    }
    
}
