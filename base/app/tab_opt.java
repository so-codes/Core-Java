package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tab_opt extends JFrame implements ActionListener {

    JTabbedPane tp;
    JPanel p1, p2, p3;
    JLabel l1, l2;
    JButton b1, b2;
    JTextField t1 , t2;
    JScrollPane sp;
    JRadioButton r1, r2;
    JComboBox<String> cb;

    tab_opt(){
        
        tp = new JTabbedPane();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        t1 = new JTextField(10);
        b1 = new JButton("Enable");

        p1.add(t1);
        p1.add(b1);

        r1 = new JRadioButton("Hello");
        r2 = new JRadioButton("Bye");
        ButtonGroup bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);

        l1 = new JLabel("Select: ");

        p2.add(l1);
        p2.add(r1);
        p2.add(r2);
        // p2.add(b3);

        cb = new JComboBox<String>();
        cb.addItem("Criz");
        cb.addItem("Criz1");
        cb.addItem("Criz2");
        cb.addItem("Criz3");

        t2 = new JTextField(10);

        b2 = new JButton("Add");

        b2.addActionListener(this);

        p3.add(cb);
        p3.add(t2);
        p3.add(b2);

        tp.addTab("Name", p1);
        tp.addTab("Radio", p2);
        tp.addTab("Combo", p3);

        add(tp);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b1.getText().equals("Enable")){
                    t1.setEnabled(true);
                    b1.setText("Disable");
                }
                else{
                    t1.setEnabled(false);
                    b1.setText("Enable");
                }
            }
        });

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hello");
            }
        });

        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Bye");
            }
        });

        setTitle("Critz");
        setSize(1000, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2){
            t2.setText(cb.getSelectedItem().toString());
        }
    }

    public static void main(String[] args) {
        new tab_opt();
    }
    
}
