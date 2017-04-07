package com.archiektor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Archiektor on 22.02.2017.
 */
public class SimpleGUI1 implements ActionListener {

    JButton button;

    public void start() {
        JFrame frame = new JFrame();

        button = new JButton("click on me ");

        button.setSize(220, 180);
        //button.setFont(Color.DARK_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setBackground(Color.DARK_GRAY);
    }

    public void changeIt() {
        JFrame frame = new JFrame();

        button = new JButton("click on me ");

        button.setSize(220, 180);
        //button.setFont(Color.DARK_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        button.addActionListener(this);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setBackground(Color.DARK_GRAY);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked !");
    }
}
