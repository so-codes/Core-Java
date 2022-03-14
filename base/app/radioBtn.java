package base.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radioBtn extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3;
    JLabel l1, l2;
    ButtonGroup bg;

    radioBtn() {
        r1 = new JRadioButton("Python");
        r2 = new JRadioButton("C++");
        r3 = new JRadioButton("Java");
        l1 = new JLabel("Select your language: ");
        l2 = new JLabel("");
        bg = new ButtonGroup();

        add(l1);
        add(r1);
        add(r2);
        add(r3);
        add(l2);

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        setTitle("Radio Button");
        setSize(230, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent criz) {
        if (criz.getSource() == r1) {
            l2.setText("User selected Python");
        }
        if (criz.getSource() == r2) {
            l2.setText("User selected C++");
        }
        if (criz.getSource() == r3) {
            l2.setText("User selected Java");
        }
    }

    public static void main(String[] args) {
        new radioBtn();
    }

}
