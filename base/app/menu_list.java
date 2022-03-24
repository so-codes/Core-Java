package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// color at least three colors, classname and three list of subjects 
public class menu_list extends JFrame implements ActionListener{

    JButton b1;
    JMenu m1 , m2 , d1;
    JMenuItem i1 , i2 , i3 , i4 , i5 , i6, color;
    JMenuBar mb;
    JLabel l1;
    JTextArea ta;

    menu_list(){

        m1 = new JMenu("Color");
        m2 = new JMenu("SY");

        i1 = new JMenuItem("Red");
        i2 = new JMenuItem("Blue");
        color = new JMenuItem("Color");

        i3 = new JMenuItem("Computers");
        i4 = new JMenuItem("Physics");

        m1.add(i1);
        m1.add(i2);
        m1.add(color);
        
        m2.add(i3);
        m2.add(i4);

        mb = new JMenuBar();

        mb.add(m1);
        mb.add(m2);

        setJMenuBar(mb);

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        color.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);

        ta = new JTextArea();
        ta.setFont(new Font("Arial", Font.PLAIN, 1000));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setEditable(false);

        add(ta);

        setTitle("Color page");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent criz) {

        if(criz.getSource() == i1){
            // mb.setBackground(Color.red);
            ta.setBackground(Color.red);
        }
        if(criz.getSource() == i2){
            // mb.setBackground(Color.blue);
            ta.setBackground(Color.blue);
        }
        if(criz.getSource() == color){
            new JColorChooser();
            Color c = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
            ta.setBackground(c);
        }
        
        if(criz.getSource() == i3){
            System.out.println(" "+i3.getText());
            JOptionPane.showMessageDialog(this, "You selected " + i3.getText(), "Invalid input", JOptionPane.ERROR_MESSAGE);
        }

        if(criz.getSource() == i4){
            System.out.println(" "+i4.getText());
            JOptionPane.showOptionDialog(this, "You selected "+ i4.getText(), "Invalid input", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, null, null);
        }
    }

    public static void main(String[] args) {
        new menu_list();
    }
    
}
