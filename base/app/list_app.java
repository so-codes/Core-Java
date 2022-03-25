package base.app;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class list_app extends JFrame implements ListSelectionListener {

    JLabel l1, l2;
    JList<String> mylist;

    list_app() {
        l1 = new JLabel("Select");
        l2 = new JLabel("");

        String[] sb = { "A", "B", "C", "D", "E" };
        mylist = new JList<String>(sb);

        mylist.addListSelectionListener(this);

        mylist.add(l1);
        mylist.add(l2);

        add(l1);
        add(mylist);
        add(l2);

        setTitle("Criz page");
        setSize(370, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void valueChanged(ListSelectionEvent e) {
        String str = "";
        // Object[] obj = mylist.getSelectedValues();
        // for(int i=0;i<obj.length;i++){
        // str += obj[i].toString() + " ";
        // }
        l2.setText(str);
    }

    public static void main(String[] args) {
        new list_app();
    }

}
