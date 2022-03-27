package assign.realdeal;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class assign3 extends JFrame implements ActionListener {

    static JFrame f;
    static JTextField l;

    String cal0, cal1, cal2;

    assign3() {
        cal0 = cal1 = cal2 = "";
        f = new JFrame("Calc");

        new assign3();

        l = new JTextField(16);
        l.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, bp, bre, beq;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        beq = new JButton("=");
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        bre = new JButton("C");
        bp = new JButton(".");

        JPanel p = new JPanel();

        bm.addActionListener(this);
        bd.addActionListener(this);
        bs.addActionListener(this);
        ba.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        bp.addActionListener(this);
        bre.addActionListener(this);
        beq.addActionListener(this);

        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(bp);
        p.add(b0);
        p.add(bre);
        p.add(beq);

        p.setBackground(Color.LIGHT_GRAY);

        f.add(p);

        f.setSize(220, 230);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent calc_pog) {

        String s = calc_pog.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!cal1.equals(""))
                cal2 = cal2 + s;
            else
                cal0 = cal0 + s;
            l.setText(cal0 + cal1 + cal2);
        } else if (s.charAt(0) == 'C') {
            cal0 = cal1 = cal2 = "";
            l.setText(cal0 + cal1 + cal2);
        } else if (s.charAt(0) == '=') {

            double te;

            if (cal1.equals("+")) {

                te = (Double.parseDouble(cal0) + Double.parseDouble(cal2));

            } else if (cal1.equals("-")) {

                te = (Double.parseDouble(cal0) - Double.parseDouble(cal2));

            } else if (cal1.equals("/")) {

                te = (Double.parseDouble(cal0) / Double.parseDouble(cal2));

            } else {

                te = (Double.parseDouble(cal0) * Double.parseDouble(cal2));

            }

            l.setText(cal0 + cal1 + cal2 + "=" + te);

            cal0 = Double.toString(te);

            cal1 = cal2 = "";
        } else {

            if (cal1.equals("") || cal2.equals("")) {
                cal1 = s;

            } else {
                double te;

                if (cal1.equals("+")) {

                    te = (Double.parseDouble(cal0) + Double.parseDouble(cal2));

                } else if (cal1.equals("-")) {

                    te = (Double.parseDouble(cal0) - Double.parseDouble(cal2));

                } else if (cal1.equals("/")) {

                    te = (Double.parseDouble(cal0) / Double.parseDouble(cal2));

                } else {

                    te = (Double.parseDouble(cal0) * Double.parseDouble(cal2));

                }

                cal0 = Double.toString(te);
                cal1 = s;
                cal2 = "";
            }
            l.setText(cal0 + cal1 + cal2);
        }
    }

    public static void main(String[] args) {
        new assign3();
    }
}
