package base.app;

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree_app extends JFrame {

    tree_app() {

        DefaultMutableTreeNode it = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode fy = new DefaultMutableTreeNode("FY");
        DefaultMutableTreeNode sy = new DefaultMutableTreeNode("SY");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("child3");

        it.add(fy);
        it.add(sy);
        it.add(child3);

        DefaultMutableTreeNode w = new DefaultMutableTreeNode("web");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("c++");

        sy.add(w);
        sy.add(c);

        JTree tree = new JTree(it);
        add(new JScrollPane(tree));

        setSize(400, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("JTree");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new tree_app();
    }
}
