package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Login implements ActionListener {
    
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Book> livres = new ArrayList<>();
        ArrayList<Loan> emprunts = new ArrayList<>();
        ArrayList<Back> retours  = new ArrayList<>();

        
        JFrame frame = new JFrame();
        
        JLabel email = new JLabel("email : ");
        JLabel password = new JLabel("Password : ");
        JLabel messageLbLabel = new JLabel();

        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("login");
        JButton resetButton = new JButton("reset");

        ImageIcon imageIcon = new ImageIcon("src/main/java/org/example/login.jpg");

        // Scale the image to the desired size
        Image scaledImage = imageIcon.getImage().getScaledInstance(500, 800, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledImageIcon);




        Login(ArrayList<Book> livers,ArrayList<User> users,ArrayList<Loan> emprunts , ArrayList<Back> retours){
            
            email.setBounds(520,100,100,30);
            emailField.setBounds(620,100,150,30);
            password.setBounds(520,150,100,30);
            passwordField.setBounds(620,150,150,30);
            loginButton.setBounds(510, 300, 150, 30);
            loginButton.addActionListener(this);
            resetButton.setBounds(660, 300, 150, 30);
            resetButton.addActionListener(this);
            messageLbLabel.setBounds(510,550,200,30);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setSize(900, 800);

            imageLabel.setBounds(0, 0, 500, 800);

            frame.add(imageLabel);
            frame.add(password);
            frame.add(email);
            frame.add(emailField);
            frame.add(passwordField);
            frame.add(loginButton);
            frame.add(resetButton);
            frame.add(messageLbLabel);
            frame.add(imageLabel);

            emailField.setText("mohammed@gmail.com");
            passwordField.setText("0000");
            
            this.users = users;
            this.emprunts = emprunts;
            this.retours = retours;
            this.livres = livers;

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
                            new Admin(livres,users,emprunts,retours);   
                            frame.dispose();
                        }
                        else 
                        {
                            User user = users.stream().filter(ur -> ur.getEmail().equals(insertedEmail)).toList().get(0);

                            new Student(livres,users,emprunts,user,retours);

                            frame.dispose();
                        }
                    }
                    else
                    {
                        messageLbLabel.setForeground(Color.red);
                        messageLbLabel.setText("the password is wrong");
                    }
                }
                else
                {
                    messageLbLabel.setForeground(Color.red);
                    messageLbLabel.setText("email not found");
                }
            }
    }
}
