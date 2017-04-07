package com.archiektor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Archiektor on 26.02.2017.
 */
public class TextArea1 {

    JFrame frame;

    JPanel panel;
    static String name;

    JTextField fieldName;

    boolean ready = false;

    public void go() {

        frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel();

        panel.setBackground(Color.LIGHT_GRAY);

        fieldName = new JTextField(12);

        fieldName.requestFocus();

        JTextField field2 = new JTextField("Your name is:");

        panel.add(field2);
        panel.add(fieldName);

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = fieldName.getText();

                System.out.println("Your name is - " + name);
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);


        /*while (name.equals(null)) {
            try {
                Thread.sleep(5000);
                ready = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (ready = true) {
            System.out.println("name - " + name);
        }*/

    }
}

