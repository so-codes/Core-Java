package assign.realdeal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class assign6 extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu file, format, more;
    JMenuItem open, save, exit;
    JMenuItem colorMenu;
    JMenu font;

    JMenuItem Italic, Bold, Plain, Roman, Serif;
    JMenuItem about;
    JTextField tf;

    assign6() {

        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        colorMenu = new JMenuItem("Color");
        font = new JMenu("Font");

        Italic = new JMenuItem("Italic");
        Bold = new JMenuItem("Bold");
        Plain = new JMenuItem("Plain");
        Roman = new JMenuItem("Roman");
        Serif = new JMenuItem("Serif");

        about = new JMenuItem("About");

        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        colorMenu.addActionListener(this);
        font.addActionListener(this);

        Italic.addActionListener(this);
        Bold.addActionListener(this);
        Plain.addActionListener(this);
        Roman.addActionListener(this);
        Serif.addActionListener(this);

        about.addActionListener(this);

        file = new JMenu("File");
        file.add(open);
        file.add(save);
        file.add(exit);

        font = new JMenu("Font");
        font.add(Italic);
        font.add(Bold);
        font.add(Plain);
        font.add(Roman);
        font.add(Serif);

        format = new JMenu("Format");
        format.add(colorMenu);
        format.add(font);

        more = new JMenu("More");
        more.add(about);

        mb = new JMenuBar();
        mb.setBounds(0, 0, 400, 20);
        mb.add(file);
        mb.add(format);
        mb.add(more);

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.PLAIN, 20));

        tf.setBounds(0, 0, 400, 20);

        add(tf);

        JScrollPane scrollPane = new JScrollPane(tf);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        scrollPane.setBounds(0, 0, 480, 430);

        add(scrollPane);
        setJMenuBar(mb);
        setTitle("File App");
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == open) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            System.out.println("i = " + i);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();

                try {
                    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                        String s1 = "", s2 = "";
                        while ((s1 = br.readLine()) != null) {
                            s2 += s1 + "\n";
                        }
                        tf.setText(s2);
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if (ae.getSource() == save) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showSaveDialog(this);
            System.out.println("i = " + i);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();

                try {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
                        String s1 = "";
                        s1 = tf.getText();
                        bw.write(s1);
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if (ae.getSource() == exit) {
            System.exit(0);
        }
        if (ae.getSource() == colorMenu) {
            Color c = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
            tf.setForeground(c);
        }
        if (ae.getSource() == about) {
            JOptionPane.showMessageDialog(this, "Made by criz", "Epik Right",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (ae.getSource() == Italic) {
            tf.setFont(new Font("Arial", Font.ITALIC, 20));
        }
        if (ae.getSource() == Bold) {
            tf.setFont(new Font("Arial", Font.BOLD, 20));
        }
        if (ae.getSource() == Plain) {
            tf.setFont(new Font("Arial", Font.PLAIN, 20));
        }
        if (ae.getSource() == Roman) {
            tf.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
        }
        if (ae.getSource() == Serif) {
            tf.setFont(new Font("Serif", Font.PLAIN, 20));
        }
    }

    public static void main(String args[]) {
        new assign6();
    }

}
