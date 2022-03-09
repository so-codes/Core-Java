package base.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class numAdd_app extends JFrame implements ActionListener {

    // ask the user for 2 numbers add them and save them in result variable and display the result and a reset button

    JLabel L1 , L2, L3 ;
    JTextField T1 , T2;
    JButton B1 , B2;

    numAdd_app() {
    
            L1 = new JLabel("Enter first number : ");
            L2 = new JLabel("Enter second number : ");
            L3 = new JLabel("");
            T1 = new JTextField(20);
            T2 = new JTextField(20);
            B1 = new JButton("Add");
            B2 = new JButton("Reset");
    
            add(L1);
            add(T1);
            add(L2);
            add(T2);
            add(B1);
            add(B2);
            add(L3);
    
            B1.addActionListener(this);
            B2.addActionListener(this);
    
            setTitle("Calculator");
            setSize(800,200);
            setVisible(true);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == B1) {
            int num1 = Integer.parseInt(T1.getText());
            int num2 = Integer.parseInt(T2.getText());
            int result = num1 + num2;
            L3.setText("Result is : " + result);
            L3.setForeground(Color.blue);
        } 
        else if(e.getSource() == B2) {
            T1.setText("");
            T2.setText("");
            L3.setText("Values reset to 0");
            L3.setForeground(Color.red);
        }

    }

    public static void main(String[] args) {
        new numAdd_app();
    } 
    
}
