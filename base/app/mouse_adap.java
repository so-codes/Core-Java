package base.app;

import javax.swing.*;
import java.awt.event.*;

public class mouse_adap extends MouseAdapter {

    JLabel l1;
    JFrame f1;
    JTextField area;

    mouse_adap(){
        f1 = new JFrame();
        l1 = new JLabel("");
        l1.setBounds(20,50,200,30);
        area = new JTextField(50);
        area.setBounds(20,80,200,30);
        area.addMouseListener(this);

        f1.add(l1);
        f1.add(area);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e){
        l1.setText("Mouse clicked: " + e.getX() + " " + e.getY());
    }

    public void mousePressed(MouseEvent e){
        l1.setText("Mouse pressed: " + e.getX() + " " + e.getY());
    }

    public void mouseReleased(MouseEvent e){
        l1.setText("Mouse released: " + e.getX() + " " + e.getY());
    }

    public void mouseEntered(MouseEvent e){
        l1.setText("Mouse entered: " + e.getX() + " " + e.getY());
    }

    public void mouseExited(MouseEvent e){
        l1.setText("Mouse exited: " + e.getX() + " " + e.getY());
    }

    public static void main(String[] args) {
        new mouse_adap();
    }
    
}
