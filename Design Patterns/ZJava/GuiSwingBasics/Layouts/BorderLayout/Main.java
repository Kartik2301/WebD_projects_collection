package ZJava.GuiSwingBasics.Layouts.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // Create Sub Panels

        JPanel subPanel1 = new JPanel();
        JPanel subPanel2 = new JPanel();
        JPanel subPanel3 = new JPanel();
        JPanel subPanel4 = new JPanel();
        JPanel subPanel5 = new JPanel();

        subPanel1.setBackground(Color.black);
        subPanel2.setBackground(Color.darkGray);
        subPanel3.setBackground(Color.gray);
        subPanel4.setBackground(Color.lightGray);
        subPanel5.setBackground(Color.white);

        subPanel1.setPreferredSize(new Dimension(50, 50));
        subPanel2.setPreferredSize(new Dimension(50, 50));
        subPanel3.setPreferredSize(new Dimension(50, 50));
        subPanel4.setPreferredSize(new Dimension(50, 50));
        subPanel5.setPreferredSize(new Dimension(50, 50));

        panel5.setLayout(new BorderLayout());
        panel5.add(subPanel1, BorderLayout.NORTH);
        panel5.add(subPanel2, BorderLayout.SOUTH);
        panel5.add(subPanel3, BorderLayout.WEST);
        panel5.add(subPanel4, BorderLayout.EAST);
        panel5.add(subPanel5, BorderLayout.CENTER);

        // Sub Panel creation done

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
