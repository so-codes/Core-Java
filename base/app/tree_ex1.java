package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class tree_ex1 extends MouseAdapter {

    JLabel content;
    JTextField text;
    JTree tree;

    tree_ex1(){

        JFrame f = new JFrame();

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

        DefaultMutableTreeNode serif = new DefaultMutableTreeNode("Serif");
        DefaultMutableTreeNode sansSerif = new DefaultMutableTreeNode("SansSerif");
        DefaultMutableTreeNode monospaced = new DefaultMutableTreeNode("Monospaced");

        font.add(serif);
        font.add(sansSerif);
        font.add(monospaced);

        tree = new JTree(style);
        f.add(new JScrollPane(tree));

        content = new JLabel("");
        text = new JTextField(50);

        // f.add(content);
        f.add(text);

        tree.addMouseListener(this);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new GridLayout(2,2));
        f.setTitle("Poggers");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e){
        TreePath path = tree.getPathForLocation(e.getX(), e.getY());
        if(path == null){
            text.setText("None obj selected");
        }
        if(path != null){
            text.setText(path.toString());
        }
    }

    public static void main(String[] args) {
        new tree_ex1();
    }
    
}
