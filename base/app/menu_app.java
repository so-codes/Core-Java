package base.app;

import javax.swing.*;
import java.awt.*;

// make a app using JMenu

public class menu_app extends JFrame{

    JMenu m1 , m2;
    JMenuItem i1 , i2 , i3 , i4;
    JMenuBar mb;

    menu_app() {
        m1 = new JMenu("File");
        m2 = new JMenu("About");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Contact us");
        i4 = new JMenuItem("About us");

        m1.add(i1);
        m1.add(i2);
        
        m2.add(i3);
        m2.add(i4);

        mb = new JMenuBar();

        mb.add(m1);
        mb.add(m2);

        setJMenuBar(mb);

        setTitle("Criz page");
        setSize(370, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new menu_app();
    }
    
}
