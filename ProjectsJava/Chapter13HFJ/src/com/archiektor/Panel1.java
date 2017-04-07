package com.archiektor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Archiektor on 26.02.2017.
 */
public class Panel1 {

    public void go() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        JButton button1 = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        //JButton button3 = new JButton("huh");

        panel.add(button1);
        panel.add(button2);
        // panel.add(button3);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);

        frame.setVisible(true);
    }
}
