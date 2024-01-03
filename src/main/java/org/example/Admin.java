package org.example;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.w3c.dom.events.MouseEvent;

public class Admin  implements ActionListener , MouseListener{


    JFrame frame = new JFrame();    

    // here we gonna put the several btns to make an action 
    JPanel sidePanel            = new JPanel();
    JPanel upPanel              = new JPanel();
    JPanel displayPanel         = new JPanel();

    // side btns
    JButton livresBtn           = new JButton("livres");
    JButton usersBtn            = new JButton("users");
    JButton empruntsBtn         = new JButton("emprunts");
    JButton retoursBtn          = new JButton("retours");
    JButton statistiquesBtn     = new JButton("statistiques");
    JButton logoutBtn           = new JButton("logout");


    // upPanel livre btns 
    JButton edit                    = new JButton("Edit");
    JButton delete                  = new JButton("Delete");
    JButton add                     = new JButton("Add");
    JButton reset                   = new JButton("Reset");



    // upPanel emprunts btns 
    JButton search                  = new JButton("search");
    JButton prolonger               = new JButton("prolonger");

    // emprunts fields and labels 
    JLabel id                       = new JLabel("id : ");
    JTextField idField              = new JTextField();
    
    JLabel year                     = new JLabel("year : ");
    JTextField yearField            = new JTextField();
    JLabel month                    = new JLabel("month : ");
    JTextField monthField           = new JTextField();
    JLabel day                      = new JLabel("day : ");
    JTextField dayField             = new JTextField();



    // livre fields and labels 
    JLabel titre                = new JLabel("titre : ");
    JTextField titreField       = new JTextField();
    JLabel auteur               = new JLabel("auteur : ");
    JTextField auteurField      = new JTextField();
    JLabel pubdate              = new JLabel("pubdate : ");
    JTextField pubdateField     = new JTextField();
    JLabel genre                = new JLabel("genre : ");
    JTextField genreField       = new JTextField();
    JLabel quantite             = new JLabel("quantite : ");
    JTextField quantiteField    = new JTextField();
    

     // user fields and labels 
    JLabel name =   new JLabel("nom : ");
    JTextField nameField = new JTextField();
    JLabel prenom = new JLabel("prenom : ");
    JTextField prenomField = new JTextField();
    JLabel age = new JLabel("age : ");
    JTextField ageField = new JTextField();
    JLabel email = new JLabel("email : ");
    JTextField emailField  = new JTextField();


    // resources 
    ArrayList<User> users       = new ArrayList<>();
    ArrayList<Livre> livres     = new ArrayList<>();
    ArrayList<Emprunt> emprunts = new ArrayList<>();
    ArrayList<Retour> retours   = new ArrayList<>();
    int tempId                  = 0;
    String currentPanel         = "";
    String globaleLivreName     = "";



    public Admin(ArrayList<Livre> livres,ArrayList<User> users,ArrayList<Emprunt> emprunts,ArrayList<Retour> retours){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setLayout(null);
        
        delete.setBounds(100, 120, 100, 30);
        delete.addActionListener(this);
        edit.setBounds(250, 120, 100, 30);
        edit.addActionListener(this);
        add.setBounds(400, 120, 100, 30);
        add.addActionListener(this);
        reset.setBounds(550,120,100,30);
        reset.addActionListener(this);

        sidePanel.setBounds(0,0,200,1000);
        sidePanel.setBackground(Color.LIGHT_GRAY);
        sidePanel.setLayout(null);

        upPanel.setBounds(200, 0,  800, 200);
        upPanel.setBackground(Color.DARK_GRAY);
        upPanel.setLayout(null);

        displayPanel.setBounds(200, 200, 800, 800);
        displayPanel.setBackground(Color.gray);
        displayPanel.setLayout(null);

        livresBtn.setBounds(10, 100, 130, 40);
        livresBtn.addActionListener(this);
        usersBtn.setBounds(10, 200, 130, 40);
        usersBtn.addActionListener(this);
        empruntsBtn.setBounds(10, 300, 130, 40);
        empruntsBtn.addActionListener(this);
        retoursBtn.setBounds(10, 400, 130, 40);
        retoursBtn.addActionListener(this);
        statistiquesBtn.setBounds(10, 500, 130, 40);
        statistiquesBtn.addActionListener(this);
        logoutBtn.setBounds(10, 600, 130, 40);
        logoutBtn.addActionListener(this);

        sidePanel.add(livresBtn);
        sidePanel.add(usersBtn);
        sidePanel.add(empruntsBtn);
        sidePanel.add(retoursBtn);
        sidePanel.add(statistiquesBtn);
        sidePanel.add(logoutBtn);

        frame.add(sidePanel);
        frame.add(upPanel);
        frame.add(displayPanel);

        this.livres = livres;
        livres.sort(null);
        this.users  = users;
        users.sort(null);
        this.emprunts = emprunts;
        emprunts.sort(null);
        this.retours = retours;
        retours.sort(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == livresBtn){
            currentPanel = "livres";
            {
                upPanel.removeAll();
                titre.setBounds(10, 10, 50, 30);
                titreField.setBounds(60, 10, 100, 30);
                auteur.setBounds(250,10, 60, 30);
                auteurField.setBounds(320, 10, 100, 30);
                pubdate.setBounds(500, 10, 70, 30);
                pubdateField.setBounds(570,10,100,30);
                genre.setBounds(10,50,60,30);
                genreField.setBounds(60,50,100,30);
                quantite.setBounds(250, 50, 70, 30);
                quantiteField.setBounds(320,50,100,30);
                reset.setBounds(550,120,100,30);
                search.setBounds(100,160,100,30);
                search.addActionListener(this);

                upPanel.add(quantite);
                upPanel.add(quantiteField);
                upPanel.add(genre);
                upPanel.add(genreField);
                upPanel.add(pubdate);
                upPanel.add(pubdateField);
                upPanel.add(titre);
                upPanel.add(titreField);
                upPanel.add(auteur);
                upPanel.add(auteurField);
                upPanel.add(delete);
                upPanel.add(add);
                upPanel.add(edit);
                upPanel.add(reset);
                upPanel.add(search);

                upPanel.revalidate();
                upPanel.repaint();
                frame.validate();
            }

            // display the livres in the displayPanel 
            {
                int i = 0;
                displayPanel.removeAll();
                for (Livre livre : livres)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }

        };
        if (e.getSource() == usersBtn)
        {

                currentPanel = "users";
                {
                upPanel.removeAll();
                name.setBounds(10, 10, 50, 30);
                nameField.setBounds(60, 10, 100, 30);
                prenom.setBounds(250,10, 60, 30);
                prenomField.setBounds(320, 10, 100, 30);
                age.setBounds(10,50,60,30);
                ageField.setBounds(60,50,100,30);
                email.setBounds(250, 50, 70, 30);
                emailField.setBounds(320,50,150,30);
                reset.setBounds(400,120,100,30);
                upPanel.add(name);
                upPanel.add(nameField);
                upPanel.add(prenom);
                upPanel.add(prenomField);
                upPanel.add(age);
                upPanel.add(ageField);
                upPanel.add(email);
                upPanel.add(emailField);
                upPanel.add(delete);
                upPanel.add(reset);
                upPanel.add(edit);
                upPanel.revalidate();
                upPanel.repaint();
                frame.validate();
            }
                
                
                // clean the displayPanel and display the users 
                {   
                    displayPanel.removeAll();
                    int  i  = 0;
                    for (User user : users)
                    {
                       if (!user.getNom().equals("admin")){
                         i += 10;
                        JPanel op = new JPanel();
                        // op.setLayout(null);
                        op.addMouseListener(this);
                        op.setBounds(0, 10 + i, 800, 30);
                        op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                        op.setBackground(Color.DARK_GRAY);
                        op.add(new JLabel("name : " + user.getNom() + "   premom : " + user.getPrenom() + "   age : " + user.getAge() + "   email : " + user.getEmail()));
                        displayPanel.add(op);
                        displayPanel.revalidate();
                        displayPanel.repaint();
                        frame.validate();
                        i += 40;
                       }
                    } 
                    frame.validate();
                }   
        };
        if (e.getSource() == empruntsBtn)
        {       
            currentPanel = "emprunts";
            {
                upPanel.removeAll();
                id.setBounds(100, 20, 30, 30);
                idField.setBounds(140, 20, 100, 30);
                search.setBounds(250, 20, 100, 30);
                search.addActionListener(this);
                day.setBounds(100, 70, 50, 30);
                dayField.setBounds(140, 70, 100, 30);
                month.setBounds(250, 70, 70, 30);
                monthField.setBounds(310, 70, 100, 30);
                year.setBounds(420,70,70,30);
                yearField.setBounds(460,70,100,30);
                prolonger.setBounds(560,70,100,30);
                prolonger.addActionListener(this);
                upPanel.add(prolonger);
                upPanel.add(day);
                upPanel.add(dayField);
                upPanel.add(month);
                upPanel.add(monthField);
                upPanel.add(year);
                upPanel.add(yearField);
                upPanel.add(id);
                upPanel.add(idField);
                upPanel.add(search);
                upPanel.revalidate();
                upPanel.repaint();
                frame.validate();
            }

              // display the emprunts in the displayPanel 
            {
                int i = 0;
                displayPanel.removeAll();
                for (Emprunt emprunt: emprunts)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("user id: " + emprunt.getId() + "   titre name : " + emprunt.getLivrename() + "   dateEmprunt : " +emprunt.getDateEmprunt() + "  dateRetour : " + emprunt.getDateRetour()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }


        
        };
        if (e.getSource() == retoursBtn){

            upPanel.removeAll();
            upPanel.revalidate();
            upPanel.repaint();

            // display the retours 
            {
                int i = 0;
                displayPanel.removeAll();
                for (Retour retour : retours)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("user id: "  + retour.getEmprunt().getId() + "   livre : " + retour.getEmprunt().getLivrename() + "   date retour : " + retour.getDateRetour()  + "  date de retour prevue : " + retour.getEmprunt().getDateRetour() + "  "));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }


        };

        if (e.getSource() == statistiquesBtn)
        {
            
            upPanel.removeAll();
            upPanel.revalidate();
            upPanel.repaint();
            displayPanel.removeAll();
            displayPanel.revalidate();
            displayPanel.repaint();

           
            int i = 11;

            {    // display livres from one to five to make it look like the most emrpunted
                int j = 0;
                for (Livre livre : livres)
                {
                    if(j < 5)
                    {
                             i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                    j++;
                    }
               
                }
            }


             // just chose a random users (the active users)
            {   
                i+=10;
                int k = 0;
                for (User user : users)
                {   
                    if ( !user.getNom().equals("admin") && k < 3)
                    {
                        i += 10;
                        JPanel op = new JPanel();
                        // op.setLayout(null);
                        op.addMouseListener(this);
                        op.setBounds(0, 10 + i, 800, 30);
                        op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                        op.setBackground(Color.DARK_GRAY);
                        op.add(new JLabel("name : " + user.getNom() + "   premom : " + user.getPrenom() + "   age : " + user.getAge() + "   email : " + user.getEmail()));
                        displayPanel.add(op);
                        displayPanel.revalidate();
                        displayPanel.repaint();
                        frame.validate();
                        i += 40;
                        k++;
                    }
                }
            }

        }

        if (e.getSource() == logoutBtn){
            new Login(users);
            frame.dispose();
        };
        if (e.getSource() == delete)
        {
         if (currentPanel.equals("livres"))  
            if (!titreField.getText().equals("")){
                livres = (ArrayList<Livre>)livres.stream().filter(livre -> !livre.getTitre().equals(titreField.getText())).collect(Collectors.toList());
                livres.sort(null);
                displayPanel.removeAll();
                 {
                int i = 0;
                for (Livre livre : livres)
                {
                    i+=30;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(100, i, 600, 25);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                }
                if (livres.size() == 0)
                {
                    displayPanel.removeAll();
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                }

            }
            }
            else {System.out.println("empty");}
        
            if (currentPanel.equals("users")){
               
                if (!emailField.equals("")){
                    users = (ArrayList<User>)users.stream().filter(u -> !u.getEmail().equals(emailField.getText())).collect(Collectors.toList());
                    users.sort(null);

                    {   
                        displayPanel.removeAll();
                        int  i  = 0;
                        for (User user : users)
                        {
                            if (!user.getNom().equals("admin")){
                            i += 10;
                            JPanel op = new JPanel();
                            // op.setLayout(null);
                            op.addMouseListener(this);
                            op.setBounds(0, 10 + i, 800, 30);
                            op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                            op.setBackground(Color.DARK_GRAY);
                            op.add(new JLabel("name : " + user.getNom() + "   premom : " + user.getPrenom() + "   age : " + user.getAge() + "   email : " + user.getEmail()));
                            displayPanel.add(op);
                            displayPanel.revalidate();
                            displayPanel.repaint();
                            frame.validate();
                            i += 40;
                        } 
                        frame.validate(); 
                        if (users.size() == 1)
                        {   
                            displayPanel.removeAll();
                            displayPanel.revalidate();
                            displayPanel.repaint();
                            frame.validate();
                        }
                    }
                  

                }   
                   

                }
                else
                    System.out.println("insert user email");
            }
            e.setSource(reset);
        };
        if (e.getSource() == add)
        {
           if (currentPanel.equals("livres"))
             if (!titreField.getText().equals("") && !auteurField.getText().equals("") && !pubdateField.getText().equals("") && !genreField.getText().equals("") && !quantiteField.getText().equals(""))
            {
                Livre Livre = new Livre(livres.get(livres.size() - 1).getId() + 1, titreField.getText(), auteurField.getText(), pubdateField.getText(), genreField.getText(),Integer.parseInt(quantiteField.getText()));
                livres.add(Livre);
                int i = 0;
                displayPanel.removeAll();
                for (Livre livre : livres)
                    {
                        i+=30;
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(100, i, 600, 25);
                        op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                        op.setBackground(Color.DARK_GRAY);
                        op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                        op.addMouseListener(this);
                        displayPanel.add(op);
                        displayPanel.revalidate();
                        displayPanel.repaint();
                        frame.validate();
                    }
            }
            else {
                System.out.println("one of the fields is empty");
            };
            e.setSource(reset);
        };
        if (e.getSource() == edit)
        {
            if (currentPanel.equals("livres"))
            {
                Livre newlivre = new Livre(tempId, titreField.getText(), auteurField.getText(), pubdateField.getText(), genreField.getText(),Integer.parseInt(quantiteField.getText()));
                livres = (ArrayList<Livre>)livres.stream().filter(livre -> livre.getId() != tempId).collect(Collectors.toList());
                livres.add(newlivre);
                livres.sort(null);
                int i = 0;
                displayPanel.removeAll();
                for (Livre livre : livres)
                {
                    i+=30;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(100, i, 600, 25);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    tempId = 0;
                }

            }
            if (currentPanel.equals("users")){
                // i need to check if the user is banned or not 
                User newUser = new User(tempId, nameField.getText(), prenomField.getText(), Integer.parseInt(ageField.getText()), emailField.getText(),false);
                users = (ArrayList<User>)users.stream().filter(user -> user.getId() != tempId).collect(Collectors.toList());
                users.add(newUser);
                users.sort(null);
                int i = 0;
                displayPanel.removeAll();
                for (User user : users)
                {
                   if (!user.getNom().equals("admin"))
                   {
                    i += 10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, 10 + i, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("name : " + user.getNom() + "   premom : " + user.getPrenom() + "   age : " + user.getAge() + "   email : " + user.getEmail()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    i += 40;
                }
                frame.validate();
            }
            tempId = 0;
            }
            e.setSource(reset);
        };
        if (e.getSource() == reset)
        {
            if (currentPanel.equals("livres")){

                titreField.setText("");
                auteurField.setText("");
                pubdateField.setText("");
                genreField.setText("");
                quantiteField.setText("");
                upPanel.revalidate();
                upPanel.repaint();;
                frame.validate();
                
            }
            else if (currentPanel.equals("users")){
                
                nameField.setText("");
                prenomField.setText("");
                ageField.setText("");
                emailField.setText("");
                upPanel.revalidate();
                upPanel.repaint();
                frame.validate();

            }
        }
        if (e.getSource() == search)
        {

            if(currentPanel.equals("livres"))
            {


                ArrayList<Livre> searchedLivres = (ArrayList<Livre>)livres.stream().filter(lv -> 
                      (lv.getAuteur().equals(auteurField.getText()) || lv.getGenre().equals(genreField.getText()) || lv.getPubDate().equals(pubdateField.getText()))
                ).collect(Collectors.toList());
                System.out.println(searchedLivres);
                {
                int i = 0;
                displayPanel.removeAll();
                for (Livre livre : searchedLivres)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("titre : " + livre.getTitre() + "   auteur : " + livre.getAuteur() + "   pubdate : " + livre.getPubDate() + "   genre : " + livre.getGenre() + "   quantite : " + livre.getQuantite()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }


            }
            else if (!idField.getText().equals("")){

                if (currentPanel.equals("emprunts"))
                {
                    tempId = Integer.parseInt(idField.getText());
                    var newEmprunts = (ArrayList<Emprunt>)emprunts.
                    stream().filter(emprunt -> emprunt.getId() == tempId).
                    collect(Collectors.toList());
                    newEmprunts.sort(null);
                    {
                        int i = 0;
                        displayPanel.removeAll();
                        for (Emprunt emprunt: newEmprunts)
                        {
                            i+=10;
                            JPanel op = new JPanel();
                            op.addMouseListener(this);
                            op.setBounds(0, i + 10, 800, 30);
                            op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                            op.setBackground(Color.DARK_GRAY);
                            op.add(new JLabel("user id: " + emprunt.getId() + "   titre name : " + emprunt.getLivrename() + "   dateEmprunt : " +emprunt.getDateEmprunt() + "  dateRetour : " + emprunt.getDateRetour()));
                            displayPanel.add(op);
                            displayPanel.revalidate();
                            displayPanel.repaint();
                            frame.validate();
                            i+= 40;
                        }
                    }
                    tempId = 0;
                }
            
            }else {
             {
                   {
                int i = 0;
                displayPanel.removeAll();
                for (Emprunt emprunt: emprunts)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("user id: " + emprunt.getId() + "   titre name : " + emprunt.getLivrename() + "   dateEmprunt : " +emprunt.getDateEmprunt() + "  dateRetour : " + emprunt.getDateRetour()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }
             }   
             tempId = 0;
            }
        }

        if (e.getSource() == prolonger)
        {

            int j = 0;
            int id = Integer.parseInt(idField.getText());
            for (Emprunt em : emprunts){
                if (em.getId() == id && em.getLivrename().equals(globaleLivreName))
                {
                    Emprunt ne = new Emprunt(globaleLivreName,em.getId(),em.getDateEmprunt(), LocalDate.of(Integer.parseInt(yearField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(dayField.getText())));
                    emprunts.remove(j);
                    emprunts.add(ne);
                    emprunts.sort(null);
                    globaleLivreName = "";
                    break;
                }
                j++;
            }

            // display 
            displayPanel.removeAll();
             {
                int i = 0;
                displayPanel.removeAll();
                for (Emprunt emprunt: emprunts)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(0, i + 10, 800, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.DARK_GRAY);
                    op.add(new JLabel("user id: " + emprunt.getId() + "   titre name : " + emprunt.getLivrename() + "   dateEmprunt : " +emprunt.getDateEmprunt() + "  dateRetour : " + emprunt.getDateRetour()));
                    displayPanel.add(op);
                    displayPanel.revalidate();
                    displayPanel.repaint();
                    frame.validate();
                    i+= 40;
                }
            }
            {  
                idField.setText("");
                monthField.setText("");
                dayField.setText("");
                yearField.setText("");
                upPanel.revalidate();
                upPanel.repaint();
                frame.validate();
            }
        }
    }


    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        if (e.getSource() instanceof JPanel) {
            JPanel clickedPanel = (JPanel) e.getSource();
            
            if (clickedPanel.getComponentCount() > 0 && clickedPanel.getComponent(0) instanceof JLabel ) {
                    if (currentPanel.equals("livres"))
                    {
                        JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
                        String name = titleLabel.getText().split(" ")[2];

                        Livre livre  = null;
                        for (Livre lv : livres)
                        if (lv.getTitre().equals(name))
                            livre = lv;
                        {
                            titreField.setText(livre.getTitre());
                            auteurField.setText(livre.getAuteur());
                            pubdateField.setText(livre.getPubDate());
                            genreField.setText(livre.getGenre());
                            quantiteField.setText(Integer.toString(livre.getQuantite()));
                            tempId = livre.getId();
                            upPanel.revalidate();
                            upPanel.repaint();
                            frame.validate();
                        }
                    }
                    else if (currentPanel.equals("users")){
                        JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
                        String name = titleLabel.getText().split(" ")[2];
                        User user = null;
                        for (User u : users)
                            if (u.getNom().equals(name))
                                    user = u;
                        {
                            nameField.setText(user.getNom());
                            prenomField.setText(user.getPrenom());
                            ageField.setText(Integer.toString(user.getAge()));
                            emailField.setText(user.getEmail());
                            tempId = user.getId();
                            upPanel.revalidate();
                            upPanel.repaint();
                            frame.validate();
                        }
                    }
                    else if (currentPanel.equals("emprunts")){

                        // just remind thhat the condition is about the book name cause every user can emprunt just one book at once 
                        JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
                        String livreName = titleLabel.getText().split(" ")[8];
                        int id = Integer.parseInt(titleLabel.getText().split(" ")[2]);

                        Emprunt emprunt = null;

                        for (Emprunt em : emprunts){
                            if (em.getId() == id && em.getLivrename().equals(livreName))
                            {
                                emprunt = em;
                                break;
                            }
                        }

                        {
                            globaleLivreName = emprunt.getLivrename();
                            idField.setText(Integer.toString(emprunt.getId()));
                            dayField.setText(Integer.toString(emprunt.getDateRetour().getDayOfMonth()));
                            monthField.setText(Integer.toString(emprunt.getDateRetour().getMonthValue()));
                            yearField.setText(Integer.toString(emprunt.getDateRetour().getYear()));
                            upPanel.revalidate();
                            upPanel.repaint();
                            frame.validate();
                        }

                    }
            }

        }

    }


    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
    }


    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
    }


    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }


    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
    }



}
