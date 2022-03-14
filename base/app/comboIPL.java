package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboIPL extends JFrame implements ActionListener {

    JComboBox<String> c1;
    JLabel l1, l2;

    comboIPL() {

        l1 = new JLabel("Select IPL team");
        l2 = new JLabel("");
        c1 = new JComboBox<String>();

        c1.addItem("Chennai Super Kings");
        c1.addItem("Mumbai Indians");
        c1.addItem("Royal Challengers");
        c1.addItem("Rajasthan Royals");
        c1.addItem("Kings XI Punjab");
        c1.addItem("Delhi Daredevils");
        c1.addItem("Kolkata Knight Riders");
        c1.addItem("Sunrisers Hyderabad");

        add(l1);
        add(c1);
        add(l2);

        c1.addActionListener(this);

        setTitle("ComboBox but IPL");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == c1) {
            if (c1.getSelectedItem().equals("Chennai Super Kings")) {
                l2.setText("Chennai Super Kings captain is M.S Dhoni");
            }
            if (c1.getSelectedItem().equals("Mumbai Indians")) {
                l2.setText("Mumbai Indians captain is Rohit Sharma");
            }
            if (c1.getSelectedItem().equals("Royal Challengers")) {
                l2.setText("Royal Challengers captain is Virat Kolhi");
            }
            if (c1.getSelectedItem().equals("Rajasthan Royals")) {
                l2.setText("Rajasthan Royals captain is Criz");
            }
            if (c1.getSelectedItem().equals("Kings XI Punjab")) {
                l2.setText("Kings XI Punjab captain is Kl Rahul");
            }
            if (c1.getSelectedItem().equals("Delhi Daredevils")) {
                l2.setText("Delhi Daredevils captain is Shreyas iyer");
            }
            if (c1.getSelectedItem().equals("Kolkata Knight Riders")) {
                l2.setText("Kolkata Knight Riders captain is Gautam gambhir");
            }
            if (c1.getSelectedItem().equals("Sunrisers Hyderabad")) {
                l2.setText("Sunrisers Hyderabad captain is Kane Williamson");
            }

        }
    }

    public static void main(String[] args) {
        new comboIPL();
    }

}