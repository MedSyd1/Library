// package org.example;

// import javax.swing.*;
// import javax.swing.border.Border;

// import java.awt.Button;
// import java.awt.Color;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseListener;
// import java.util.ArrayList;

// public class Admin implements ActionListener , MouseListener {

//     // to avoid the  conflict 
//     String currentDisplay = "";

//     // the data fields 
//     ArrayList<User> users = new ArrayList<>();
//     ArrayList<Livre> livres = new ArrayList<>();
//     ArrayList<Emprunt> emprunts = new ArrayList<>();
//     ArrayList<Retour> retours = new ArrayList<>();

//     // the frame and the main panels
//     JFrame frame = new JFrame();
//     JPanel bntsPanel  = new JPanel();
//     JPanel displayPannel = new JPanel();
//     JPanel livresPanel = new JPanel();
//     JPanel usersPanel  = new JPanel();
//     JPanel empruntsPanel = new JPanel();
//     JPanel retoursPanel = new JPanel();
//     JPanel searchAndFilterPanel = new JPanel();
//     JPanel statisPanel = new JPanel();
//     JPanel infoPanel   = new JPanel();
    

//     // the book informations 
//     JLabel titre    = new JLabel("titre : ");
//     JTextField titreField = new JTextField();
//     JLabel auteur   = new JLabel("auteur : ");
//     JTextField auteurField = new JTextField();
//     JLabel pubDate  = new JLabel("pubdate : ");
//     JTextField pudDateField = new JTextField();
//     JLabel genre    = new JLabel("genre : ");
//     JTextField genreField = new JTextField();
//     JLabel quantite = new JLabel("quantite : ");
//     JTextField quantiteFiled = new JTextField();
    

//     //  


//     // for delete and add and update 
//     JPanel deletePanel  = new JPanel();
//     JPanel ajoutPanel   = new JPanel();
//     JPanel updatePanel   = new JPanel();
    

//     // the side btns 
    // JButton livresBtn = new JButton("livres");
    // JButton usersBtn  = new JButton("users");
    // JButton empruntsBtn = new JButton("emprunts");
    // JButton retoursBtn  = new JButton("retours");
    // JButton searchAndFilterBtn = new JButton("search and filter");
    // JButton statistiquesBtn = new JButton("statistiques");
    // JButton logoutBtn = new JButton("logout");
    
//     // the upPanel btns  
//     JButton delete = new JButton();
//     JButton update = new JButton();
//     JButton ajout  = new JButton();


//     // the stupid constructor 
//     public Admin(){    

//         livres = new ListLivres().getLivres();
//         bntsPanel.setLayout(null);
//         bntsPanel.setBounds(0, 0, 150, 750);
//         bntsPanel.setBackground(Color.GRAY);

//         infoPanel.setLayout(null);
//         infoPanel.setBounds(0, 0, 600, 100);
//         infoPanel.setBackground(Color.PINK);

//         displayPannel.setLayout(null);
//         displayPannel.setBounds(150, 100, 600, 750);
//         displayPannel.add(infoPanel);

//         livresBtn.setBounds(10,100,100,30);
//         livresBtn.addActionListener(this);
//         usersBtn.setBounds(10,150,100,30);
//         usersBtn.addActionListener(this);
//         empruntsBtn.setBounds(10,200,100,30);
//         empruntsBtn.addActionListener(this);
//         retoursBtn.setBounds(10,250,100,30);
//         retoursBtn.addActionListener(this);
//         searchAndFilterBtn.setBounds(10,300,100,30);
//         searchAndFilterBtn.addActionListener(this);
//         statistiquesBtn.setBounds(10,350,100,30);
//         statistiquesBtn.addActionListener(this);
//         logoutBtn.setBounds(10,400,100,30);
//         logoutBtn.addActionListener(this);

//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//         frame.setSize(750,750);
//         frame.setLayout(null);

//         bntsPanel.add(livresBtn);
//         bntsPanel.add(usersBtn);
//         bntsPanel.add(empruntsBtn);
//         bntsPanel.add(retoursBtn);
//         bntsPanel.add(searchAndFilterBtn);
//         bntsPanel.add(statistiquesBtn);
//         bntsPanel.add(logoutBtn);
//         frame.add(bntsPanel);
//         frame.add(displayPannel);

//     }

    


//     @Override
//     public void actionPerformed(ActionEvent e){

           
//            if (e.getSource() == livresBtn && !currentDisplay.equals("livres"))
//            {    
//                 int i  = 0;
//                 currentDisplay = "livres";

//                 displayPannel.setBounds(150, 20, 600, 750);
//                 displayPannel.setBackground(Color.LIGHT_GRAY);
//                 displayPannel.setLayout(null);

//                 JPanel upPanel = new JPanel();
//                  delete  = new JButton("delete");
//                  delete.addActionListener(this);
//                  update  = new JButton("update");
//                  update.addActionListener(this);
//                  ajout = new JButton("ajout");
//                  ajout.addActionListener(this);

//                 upPanel.add(delete);
//                 upPanel.add(update);
//                 upPanel.add(ajout);

//                 upPanel.setBounds(0, 0, 600, 35);
//                 upPanel.setBackground(Color.RED);
//                 displayPannel.add(upPanel);


//                 for (Livre livre : livres)
//                 {   
//                     i+=35;
//                     JPanel oneLP = new JPanel();
//                     oneLP.setBounds(10,i,600,30);  
//                     oneLP.add(new JLabel(livre.getTitre()+ " "));
//                     oneLP.setBackground(Color.PINK);
//                     oneLP.addMouseListener(this);
//                     displayPannel.add(oneLP);
                    
//                 }
//                 displayPannel.validate();
//                 frame.validate();
//            }    
//            if (e.getSource() == usersBtn)
//            {
//                 currentDisplay = "users";
//                 System.out.println("users");
//            } 
//            if (e.getSource() == empruntsBtn)
//            {
//                 currentDisplay = "emprunts";
//                 System.out.println("emprunts");
//            } 
//             if (e.getSource() == retoursBtn)
//            {    
//                 currentDisplay = "retours";
//                 System.out.println("retours");
//            } 
//             if (e.getSource() == searchAndFilterBtn)
//            {
//                 currentDisplay = "searchAndFilter";
//                 System.out.println("search and filter");
//            } 
//             if (e.getSource() == statistiquesBtn)
//            {
//                 currentDisplay = "statistiques";
//                 System.out.println("stati");
//            } 
//             if (e.getSource() == logoutBtn)
//            {
//                 new Login(new ArrayList<>());
//                 frame.dispose();
//            } 
//            if (e.getSource() == delete)
//            {
//                 currentDisplay = "delete";
//                 System.out.println("delete");
               
//            }
//            if (e.getSource() == update)
//            {
//             System.out.println("update");
//            }
//            if (e.getSource() == ajout)
//            {
//             System.out.println("ajout");
//            }
 
//     }


//     @Override
//     public void mouseClicked(MouseEvent e) {

        // if (e.getSource() instanceof JPanel) {
        //     JPanel clickedPanel = (JPanel) e.getSource();
            
        //     if (clickedPanel.getComponentCount() > 0 && clickedPanel.getComponent(0) instanceof JLabel) {
        //         JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
        //         System.out.println(titleLabel.getText());
                
        //     }
        // }

//     }


//     @Override
//     public void mousePressed(MouseEvent e) {

//     }

//     @Override
//     public void mouseReleased(MouseEvent e) {
//     }

//     @Override
//     public void mouseEntered(MouseEvent e) {
//     }


//     @Override
//     public void mouseExited(MouseEvent e) {
//     }
// }
