package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Login implements ActionListener {
    
        ArrayList<User> users = new ArrayList<>();

        JFrame frame = new JFrame();
        
        JLabel email = new JLabel("email : ");
        JLabel password = new JLabel("Password : ");
        JLabel messageLbLabel = new JLabel();

        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("login");
        JButton resetButton = new JButton("reset");

        Login(ArrayList<User> users){
            this.users = users;

            email.setBounds(100,100,100,30);
            emailField.setBounds(200,100,150,30);
            password.setBounds(100,150,100,30);
            passwordField.setBounds(200,150,150,30);
            loginButton.setBounds(100, 300, 150, 30);
            loginButton.addActionListener(this);
            resetButton.setBounds(250, 300, 150, 30);
            resetButton.addActionListener(this);
            messageLbLabel.setBounds(100,550,200,30);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setSize(800, 800);

            frame.add(password);
            frame.add(email);
            frame.add(emailField);
            frame.add(passwordField);
            frame.add(loginButton);
            frame.add(resetButton);
            frame.add(messageLbLabel);

        }

    
    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == resetButton)
            {
                emailField.setText("");
                passwordField.setText("");
            }
            if (e.getSource() == loginButton)
            {

                String insertedEmail = emailField.getText();
                String insertedPassword = String.valueOf(passwordField.getPassword());
                List<String> emails = users.stream().map(u -> u.getEmail()).toList();
                List<String> passwords = users.stream().map(u -> u.getPassword()).toList();
               if (emails.contains(insertedEmail))
                {
                    if (passwords.contains(insertedPassword))
                    {

                        if (insertedPassword.equals("admin"))
                        {

                            new Admin(new ListLivres().getLivres(),new ListOfUsers().getUsers(),new ListEmprunts().getEmprunts(),new ListRetours().getRetours());   
                            frame.dispose();
                        }
                        else 
                        {
                            User user = users.stream().filter(ur -> ur.getEmail().equals(insertedEmail)).toList().get(0);

                            new Member(user.getNom());
                            frame.dispose();
                        }
                    }
                    else
                    {
                        messageLbLabel.setForeground(Color.red);
                        messageLbLabel.setText("the password is wrong baby");
                    }
                }
                else
                {
                    messageLbLabel.setForeground(Color.red);
                    messageLbLabel.setText("this fucking email not found bitch");
                }
            }
    }
}
