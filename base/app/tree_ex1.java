package base.app;

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree_ex1 extends JFrame {

    tree_ex1(){

        DefaultMutableTreeNode style  = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font ");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");

        color.add(red);
        color.add(blue);
        color.add(green);

        JTree tree = new JTree(style);
        add(new JScrollPane(tree));

        setSize(400,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Poggers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new tree_ex1();
    }
    
}
