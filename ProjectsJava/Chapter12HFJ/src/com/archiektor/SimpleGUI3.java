package com.archiektor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Archiektor on 22.02.2017.
 */
public class SimpleGUI3 {

    JFrame frame;
    JButton colorButton;
    JButton labelButton;
    Label label;

    public void go() {
        frame = new JFrame();

        label = new Label("Tru-lia-la");

        colorButton = new JButton("Change color");
        labelButton = new JButton("Change label");
        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());

        Animate panel = new Animate();

        panel.go();

        colorButton.setSize(220, 180);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);


        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch ! ");
        }
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorButton) {
            frame.repaint();
        } else {
            label.setText("Harmfull !!");
        }*/

}

