package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hobbie extends JFrame implements ItemListener{

    JCheckBox c1 , c2 , c3, c4;
    JLabel l1 , l2;

    hobbie(){

        c1 = new JCheckBox("Dance");
        c2 = new JCheckBox("Music");
        c3 = new JCheckBox("Cricket");
        c4 = new JCheckBox("Cooking");

        l1 = new JLabel("Select your hobbie: ");
        l2 = new JLabel("");

        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l2);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        setTitle("Hobbie");
        setSize(200, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void itemStateChanged(ItemEvent e){
        
        if(e.getSource() == c1){
            if(c1.isSelected()){
                l2.setText("User selected Dance");
            }
            else{
                l2.setText("User did not select Dance");
            }
        }
        if(e.getSource() == c2){
            if(c2.isSelected()){
                l2.setText("User selected Music");
            }
            else{
                l2.setText("User did not select Music");
            }
        }
        if(e.getSource() == c3){
            if(c3.isSelected()){
                l2.setText("User selected Cricket");
            }
            else{
                l2.setText("User did not select Cricket");
            }
        }
        if(e.getSource() == c4){
            if(c4.isSelected()){
                l2.setText("User selected Cooking");
            }
            else{
                l2.setText("User did not select Cooking");
            }
        }
    }

    public static void main(String[] args) {
        new hobbie();
    }
    
}
