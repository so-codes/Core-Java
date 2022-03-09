package base.app;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class welcome_app extends JFrame implements ActionListener { 

    JLabel L1 , L2 ;
    JTextField T1 ;
    JButton B1;

    welcome_app() {
        L1 = new JLabel("Enter your name : ");
        L2 = new JLabel("");
        T1 = new JTextField(20);
        B1 = new JButton("Click Me");

        add(L1);
        add(T1);
        add(B1);
        add(L2);

        B1.addActionListener(this);

        setTitle("Welcome");
        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == B1) {
            L2.setText("Hello " + T1.getText());
        } 
    }

    public static void main(String[] args) {
        new welcome_app();
    } 
}
