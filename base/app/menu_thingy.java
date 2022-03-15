package base.app;

import javax.swing.*;
import java.awt.*;

public class menu_thingy  {

    JMenu m1 , m2 , d1;
    JMenuItem i1 , i2 , i3 , i4 , i5 , i6;
    JMenuBar mb;

    menu_thingy() {
        m1 = new JMenu("Color");
        m2 = new JMenu("City");

        i1 = new JMenuItem("Red");
        i2 = new JMenuItem("Blue");

        i3 = new JMenuItem("Mumbai");
        d1 = new JMenu("Delhi");

        i5 = new JMenuItem("A");
        i6 = new JMenuItem("B");
        
        m1.add(i1);
        m1.add(i2);
        
        m2.add(i3);
        m2.add(d1);

        d1.add(i5);
        d1.add(i6);

        mb = new JMenuBar();

        mb.add(m1);
        mb.add(m2);

        JFrame f = new JFrame();

        f.setJMenuBar(mb);

        f.setTitle("Criz page");
        f.setSize(370, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new menu_thingy();
    }
    
}
