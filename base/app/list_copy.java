package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class list_copy extends JFrame implements ActionListener{
    JList<String> l1,l2;
    JButton b1;
    String color[]={ "red","green","yellow","white"};

    list_copy(){
        l1=new JList<>(color);
        l2=new JList<>();
        l1.setVisibleRowCount(4);
        l2.setVisibleRowCount(4);
        b1=new JButton("copy");
        l1.setBounds(100,100,75,75);
        setSize(400,200);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Jlist");
        add(new JScrollPane(l1));
        add(new JScrollPane(l2));
        add(b1);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            l2.setListData((String[]) l1.getSelectedValues());
        }
    }
        
    public static void main(String[] args){
        new list_copy();
    }
}