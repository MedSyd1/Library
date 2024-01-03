package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Member implements ActionListener{


    JFrame frame = new JFrame();
    JLabel message = new JLabel();


    Member(String name){

        message.setText("hi " + name);
        message.setBounds(100,100,100,30);
        
        frame.add(message);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);


    }


    public void actionPerformed(ActionEvent e){

    }
}