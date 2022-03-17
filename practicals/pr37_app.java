package practicals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// write a program in java to create ui for selecting movie name using combo box and display the director name , actor , actress name

public class pr37_app extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JComboBox<String> c1;
    JButton b1;

    pr37_app(){

        l1 = new JLabel("Select Movie Name: ");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");

        c1 = new JComboBox<String>();

        c1.addItem("Batman");
        c1.addItem("Spiderman");
        c1.addItem("Ironman");
        c1.addItem("Superman");
        c1.addItem("Hulk");

        add(l1);
        add(c1);
        add(l2);
        add(l3);
        add(l4);

        c1.addActionListener(this);

        setTitle("Movie");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == c1) {
            if(c1.getSelectedItem().equals("Batman")){
                l2.setText("Batman Director is Tim Burton");
                l3.setText("Batman Actor is Christian Bale");
                l4.setText("Batman Actress is Michelle Pfeiffer");
            }
            if(c1.getSelectedItem().equals("Spiderman")){
                l2.setText("Spiderman Director is Sam Raimi");
                l3.setText("Spiderman Actor is Tobey Maguire");
                l4.setText("Spiderman Actress is Katelyn Johnson");
            }
            if(c1.getSelectedItem().equals("Ironman")){
                l2.setText("Ironman Director is Jon Favreau");
                l3.setText("Ironman Actor is Robert Downey Jr.");
                l4.setText("Ironman Actress is Gwyneth Paltrow");
            }
            if(c1.getSelectedItem().equals("Superman")){
                l2.setText("Superman Director is Christopher Nolan");
                l3.setText("Superman Actor is Franka Potente");
                l4.setText("Superman Actress is Margot Robbie");
            }
            if(c1.getSelectedItem().equals("Hulk")){
                l2.setText("Hulk Director is Louis Leterrier");
                l3.setText("Hulk Actor is Jake Gyllenhaal");
                l4.setText("Hulk Actress is Michelle Williams");
            }
        }
    }

    public static void main(String[] args) {
        new pr37_app();
    }
    
}
