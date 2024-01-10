package org.example;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Student implements ActionListener{


    JFrame studentFrame = new JFrame();
    JPanel leftPanel = new JPanel();
    JPanel infosPanel = new JPanel();
    JButton logoutButton = new JButton("logout");

    JLabel name  = new JLabel();
    JLabel email = new JLabel();
    JLabel age   = new JLabel();

    // student image 
    ImageIcon imageIcon = new ImageIcon("src/main/java/org/example/user.png");
    Image scaledImage = imageIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
    JLabel imageLabel = new JLabel(scaledImageIcon);

    // student name  
    ImageIcon nameIcon = new ImageIcon("src/main/java/org/example/id-card.png");
    Image scaledNameIcon = nameIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon namescaledImageIcon = new ImageIcon(scaledNameIcon);
    JLabel nameLabel = new JLabel(namescaledImageIcon);

    // gmail
    ImageIcon emailIcon = new ImageIcon("src/main/java/org/example/gmail.png");
    Image scaledemailIcon = emailIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon emailcaledImageIcon = new ImageIcon(scaledemailIcon);
    JLabel emailLabel = new JLabel(emailcaledImageIcon);

    // age 
    ImageIcon ageIcon = new ImageIcon("src/main/java/org/example/age.png");
    Image scaledAgeIcon = ageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon agescaledicon = new ImageIcon(scaledAgeIcon);
    JLabel agLabel = new JLabel(agescaledicon);

    // lougout btn 
    ImageIcon logoutImageIcon = new ImageIcon("src/main/java/org/example/logout.png");
    Image logoutcaledImage = logoutImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon logoutscaledImageIcon = new ImageIcon(logoutcaledImage);
    JLabel lougoutimageLabel = new JLabel(logoutscaledImageIcon);

    
    User currentUser = null;
    
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();
    ArrayList<Back> returns   = new ArrayList<>(); 

    public Student(ArrayList<Book> books , ArrayList<User> users, ArrayList<Loan> loans,User user,ArrayList<Back> returns){

        this.currentUser = user;
        this.books = books;
        this.users = users;
        this.loans = loans;
        this.returns = returns;

        ImageIcon bannedIcon = new ImageIcon("src/main/java/org/example/"+ ((user.isBaned())? "forbidden.png" : "accept.png"));
        Image scaledBannedIcon = bannedIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon scaledBannedIonImg = new ImageIcon(scaledBannedIcon);
        JLabel bannedLabel = new JLabel(scaledBannedIonImg);
        
        studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentFrame.setLayout(null);
        studentFrame.setVisible(true);
        studentFrame.setSize(800, 800);
        
        name.setBounds(80,125,100,30);
        name.setText(user.getNom());
        email.setBounds(80,170,120,40);
        email.setText(user.getEmail());
        age.setBounds(80,220,40,40);
        age.setText(Integer.toString(user.getAge()));

        imageLabel.setBounds(60, 30, 70, 70);
        nameLabel.setBounds(10, 120, 40, 40);
        emailLabel.setBounds(10,170,40,40);
        agLabel.setBounds(10,220,40,40);
        bannedLabel.setBounds(10,270,40,40);
        
        logoutButton.setBounds(10,500,100,40);

        lougoutimageLabel.setBounds(100,500,100,40);

        logoutButton.addActionListener(this);
        leftPanel.add(lougoutimageLabel);
        leftPanel.add(logoutButton);
        leftPanel.add(bannedLabel);
        leftPanel.add(age);
        leftPanel.add(agLabel);
        leftPanel.add(nameLabel);
        leftPanel.add(name);
        leftPanel.add(email);
        leftPanel.add(emailLabel);
        leftPanel.add(imageLabel);
        leftPanel.setLayout(null);
        leftPanel.setBounds(0,0,200,studentFrame.getHeight());

        infosPanel.setLayout(null);
        infosPanel.setBounds(leftPanel.getWidth() + 10,0,studentFrame.getWidth() - leftPanel.getWidth(),studentFrame.getHeight());
        infosPanel.setVisible(true);

        JLabel msg = new JLabel("available books");
        msg.setBounds(40, 40, 150, 40);
        infosPanel.add(msg);

        ImageIcon dispoIcon = new ImageIcon("src/main/java/org/example/available.png");
        Image dp = dispoIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon dpl = new ImageIcon(dp);
        JLabel availbaleLabel = new JLabel(dpl);
    
        JPanel livreDisp = new JPanel();
        livreDisp.setBounds(60, 10, 200, 50);
        availbaleLabel.setBounds(160, 40, 40, 40);
        livreDisp.add(msg);
        livreDisp.add(availbaleLabel);
        infosPanel.add(livreDisp);

        int i = 50;
        {
            ArrayList<Book> livreDispo  = (ArrayList<Book>) books.stream().filter(lv -> lv.getQuantity() > 0).collect(Collectors.toList());

            for (Book livre : livreDispo) {
                i += 10;
                JPanel op = new JPanel();
                op.setBounds(0, i + 10, 600, 30);
                op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                op.setBackground(Color.GRAY);
                op.add(new JLabel("title : " + livre.getTitle() + "   author : " + livre.getAuthor() + "   PD : " + livre.getPd() + "   type : " + livre.getType() + "   quantity : " + livre.getQuantity()));
                
                infosPanel.add(op);
                infosPanel.revalidate();
                infosPanel.repaint();
                studentFrame.validate();
                i += 40;
            }
        }

        JPanel myEmrpunt = new JPanel();
        JLabel msg1      = new JLabel("my loans");

        ImageIcon emprunt = new ImageIcon("src/main/java/org/example/emprunt.png");
        Image dd = emprunt.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon dll = new ImageIcon(dd);
        JLabel myempruntLabel = new JLabel(dll);

        myEmrpunt.setBounds(60,i +10,200,40);
        myEmrpunt.add(msg1);
        myEmrpunt.add(myempruntLabel);
        infosPanel.add(myEmrpunt);
        {   
                ArrayList<Loan> empruntsCurrent = (ArrayList<Loan>) loans.stream().filter(emm -> emm.getId() == user.getId()).collect(Collectors.toList());
                i+=60;
                for (Loan em: empruntsCurrent)
                {
                    JPanel op = new JPanel();
                    op.setBounds(0, i + 10, 600, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.GRAY);
                    op.add(new JLabel("user id: " + em.getId() + "   book name : " + em.getTitleName() + "   LD : " +em.getLD() + "  BD : " + em.getBD()));
                    infosPanel.add(op);
                    infosPanel.revalidate();
                    infosPanel.repaint();
                    studentFrame.validate();
                    i+= 40;
                }
        }
        studentFrame.add(leftPanel);
        studentFrame.add(infosPanel);
    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource() == logoutButton){
            new Login( books,users, loans, returns);
            studentFrame.dispose();
        }
    }
}