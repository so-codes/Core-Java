package base.app;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tab_pane extends JFrame {

    JTabbedPane tp;
    JPanel p1, p2, p3;
    JLabel l1, l2, l3 ,l4;
    JButton b1, b2, b3;
    JTextField t1, t2, t3;
    JTextArea ta;
    JScrollPane sp;

    tab_pane(){

        tp = new JTabbedPane();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        l1 = new JLabel("Name: ");
        l2 = new JLabel("Age: ");
        l3 = new JLabel("Registration: ");

        l4 = new JLabel("HI i am Criz !");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        ta = new JTextArea(10, 10);
        sp = new JScrollPane(ta);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.add(sp);

        p3.add(l4);

        tp.addTab("Name", p1);
        tp.addTab("Registration", p2);
        tp.addTab("Help", p3);
        
        add(tp);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String age = t2.getText();
                String Registration = t3.getText();
                ta.setText(name + "\n" + age + "\n" + Registration);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                ta.setText("");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 

            }
        });

        setTitle("Critz");
        setSize(1000, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new tab_pane();
    }
    
}
