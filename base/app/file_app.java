package base.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class file_app extends JFrame implements ActionListener{

    JMenuBar mb;
    JMenu file;
    JMenuItem open, colorMenu , save , exit;
    JTextArea ta;

    file_app(){
        
        open = new JMenuItem("Open");
        colorMenu = new JMenuItem("Color");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        open.addActionListener(this);
        colorMenu.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        file = new JMenu("File");
        file.add(open);
        file.add(colorMenu);
        file.add(save);
        file.add(exit);

        mb = new JMenuBar();
        mb.setBounds(0, 0, 400, 20);
        mb.add(file);

        ta = new JTextArea();
        ta.setFont(new Font("Arial", Font.PLAIN, 20));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setEditable(false);

        add(ta);
        setJMenuBar(mb);
        setTitle("File App");
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == open){
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            System.out.println("i = " + i);
            if(i == JFileChooser.APPROVE_OPTION){
                File f = fc.getSelectedFile();
                String filepath = f.getPath();

                try{
                    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                        String s1 = "" , s2 = "";
                        while((s1 = br.readLine()) != null){
                            s2 += s1 + "\n";
                        }
                        ta.setText(s2);
                    }
                }catch(IOException e1){
                    System.out.println("Error: " + e1);
                }
            }
        }
        if(e.getSource() == colorMenu){
            new JColorChooser();
            Color c = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
            // ta.setBackground(c);
            ta.setForeground(c);
            // ta.setSelectedTextColor(c);
        }
        if(e.getSource() == save){
            JFileChooser fc = new JFileChooser();
            int i = fc.showSaveDialog(this);
            if(i == JFileChooser.APPROVE_OPTION){
                File f = fc.getSelectedFile();
                String filepath = f.getPath();

                try{
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
                        String s1 = ta.getText();
                        bw.write(s1);
                    }
                }catch(IOException e1){
                    System.out.println("Error: " + e1);
                }
            }
        }
        if(e.getSource() == exit){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new file_app();
    }
    
}
