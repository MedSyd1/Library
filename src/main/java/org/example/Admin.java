package org.example;

import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.time.LocalDate;

import java.util.ArrayList;

import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Admin  implements ActionListener , MouseListener{


    JFrame mainFrame = new JFrame();

    // admin image 
    ImageIcon imageIcon = new ImageIcon("src/main/java/org/example/imgs/admin.png");
    Image scaledImage = imageIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
    JLabel imageLabel = new JLabel(scaledImageIcon);
    
    // books image 
    ImageIcon booksImageIcon = new ImageIcon("src/main/java/org/example/books.png");
    Image booksscaledImage = booksImageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
    ImageIcon booksscaledImageIcon = new ImageIcon(booksscaledImage);
    JLabel booksimageLabel = new JLabel(booksscaledImageIcon);
        
    // users image 
    ImageIcon usersImageIcon = new ImageIcon("src/main/java/org/example/team.png");
    Image usersscaledImage = usersImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon usersscaledImageIcon = new ImageIcon(usersscaledImage);
    JLabel usersimageLabel = new JLabel(usersscaledImageIcon);
    
    // loans image 
    ImageIcon empruntsImageIcon = new ImageIcon("src/main/java/org/example/emprunt.png");
    Image empruntscaledImage = empruntsImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon empruntscaledImageIcon = new ImageIcon(empruntscaledImage);
    JLabel empruntimageLabel = new JLabel(empruntscaledImageIcon);

    // back image 
    ImageIcon retourImageIcon = new ImageIcon("src/main/java/org/example/retour.png");
    Image retourscaledImage = retourImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon retourcaledImageIcon = new ImageIcon(retourscaledImage);
    JLabel retourimageLabel = new JLabel(retourcaledImageIcon);

     // statistics image 
    ImageIcon statisImageIcon = new ImageIcon("src/main/java/org/example/analytics.png");
    Image statiscaledImage = statisImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon statisscaledImageIcon = new ImageIcon(statiscaledImage);
    JLabel statisimageLabel = new JLabel(statisscaledImageIcon);

      // lougout image 
    ImageIcon logoutImageIcon = new ImageIcon("src/main/java/org/example/logout.png");
    Image logoutcaledImage = logoutImageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon logoutscaledImageIcon = new ImageIcon(logoutcaledImage);
    JLabel lougoutimageLabel = new JLabel(logoutscaledImageIcon);

    JPanel LeftPanel = new JPanel();
    JPanel upPanel = new JPanel();
    JPanel rightPanel = new JPanel();

    JButton booksbutton = new JButton("books");
    JButton usersButton = new JButton("users");
    JButton loansButton = new JButton("loans");
    JButton backButton = new JButton("returns");
    JButton generalButton = new JButton("generalities");
    JButton logoutButton = new JButton("logout");
    JButton edit = new JButton("Edit");
    JButton delete = new JButton("Delete");
    JButton add = new JButton("Add");
    JButton reset = new JButton("Reset");
    JButton filter = new JButton("Filter");
    JButton search = new JButton("search");
    JButton extend = new JButton("extend");
    JTextField idField = new JTextField();
    JTextField yearField = new JTextField();
    JTextField monthField = new JTextField();
    JTextField dayField = new JTextField();
    JTextField titleField = new JTextField();
    JTextField authorField = new JTextField();
    JTextField pdField = new JTextField();
    JTextField typeField = new JTextField();
    JTextField quantityField = new JTextField();
    JTextField nameField = new JTextField();
    JTextField secondNameField = new JTextField();
    JTextField ageField = new JTextField();
    JTextField emailField  = new JTextField();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();
    ArrayList<Back> backs = new ArrayList<>();
    int idPrime = 0;
    String chosenPanel = "";
    String gbookName = "";



    public Admin(ArrayList<Book> books,ArrayList<User> users,ArrayList<Loan> loans,ArrayList<Back> backs){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 1000);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);

        delete.setBounds(60, 120, 100, 30);
        delete.addActionListener(this);
        edit.setBounds(320, 120, 100, 30);
        edit.addActionListener(this);
        add.setBounds(400, 120, 100, 30);
        add.addActionListener(this);
        reset.setBounds(550,120,100,30);
        reset.addActionListener(this);

        LeftPanel.setBounds(0,0,200,1000);
        LeftPanel.setBackground(Color.white);
        LeftPanel.setLayout(null);

        upPanel.setBounds(200, 0,  800, 200);
        upPanel.setBackground(Color.white);
        upPanel.setLayout(null);

        rightPanel.setBounds(200, 200, 800, 800);
        rightPanel.setBackground(Color.white);
        rightPanel.setLayout(null);

        booksbutton.setBounds(10, 100, 130, 40);
        booksbutton.addActionListener(this);
        usersButton.setBounds(10, 200, 130, 40);
        usersButton.addActionListener(this);
        loansButton.setBounds(10, 300, 130, 40);
        loansButton.addActionListener(this);
        backButton.setBounds(10, 400, 130, 40);
        backButton.addActionListener(this);
        generalButton.setBounds(10, 500, 130, 40);
        generalButton.addActionListener(this);
        logoutButton.setBounds(10, 600, 130, 40);
        logoutButton.addActionListener(this);

        imageLabel.setBounds(50, 10, 70, 70);
        booksimageLabel.setBounds(150,105,30,30);
        usersimageLabel.setBounds(150, 200, 40, 40);
        empruntimageLabel.setBounds(150, 300, 40, 40);
        retourimageLabel.setBounds(150, 400, 40, 40);
        statisimageLabel.setBounds(150, 500, 40, 40);
        lougoutimageLabel.setBounds(150, 600, 40, 40);


        LeftPanel.add(lougoutimageLabel);
        LeftPanel.add(statisimageLabel);
        LeftPanel.add(retourimageLabel);
        LeftPanel.add(empruntimageLabel);
        LeftPanel.add(usersimageLabel);
        LeftPanel.add(booksimageLabel);
        LeftPanel.add(imageLabel);
        LeftPanel.add(booksbutton);
        LeftPanel.add(usersButton);
        LeftPanel.add(loansButton);
        LeftPanel.add(backButton);
        LeftPanel.add(generalButton);
        LeftPanel.add(logoutButton);

        mainFrame.add(LeftPanel);
        mainFrame.add(upPanel);
        mainFrame.add(rightPanel);

        this.books = books;
        books.sort(null);
        this.users  = users;
        users.sort(null);
        this.loans = loans;
        loans.sort(null);
        this.backs = backs;
        backs.sort(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == booksbutton){
            chosenPanel = "books";
            {
                upPanel.removeAll();
                titleField.setBounds(60, 10, 100, 30);
                authorField.setBounds(320, 10, 100, 30);
                pdField.setBounds(570,10,100,30);
                typeField.setBounds(60,50,100,30);
                quantityField.setBounds(320,50,100,30);
                reset.setBounds(570,120,100,30);
                search.setBounds(60,160,100,30);
                search.addActionListener(this);
                filter.setBounds(320,160,100,30);
                filter.addActionListener(this);
                add.setBounds(570, 160, 100, 30);

                upPanel.add(quantityField);
                upPanel.add(typeField);
                upPanel.add(pdField);
                upPanel.add(titleField);
                upPanel.add(authorField);
                upPanel.add(delete);
                upPanel.add(add);
                upPanel.add(edit);
                upPanel.add(reset);
                upPanel.add(search);
                upPanel.add(filter);

                upPanel.revalidate();
                upPanel.repaint();
                mainFrame.validate();
            }

            {   
                int x = 10;
                int y = 10; 
                rightPanel.removeAll();
                for (Book livre : books) 
                {
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 150, 150);
                    op.setBackground(Color.white);
                    op.add(new JLabel("title : " + livre.getTitle()));
                    op.add(new JLabel("   author : " + livre.getAuthor()));
                    op.add(new JLabel("   PD : " + livre.getPd()));
                    op.add(new JLabel("   type : " + livre.getType() ));
                    op.add(new JLabel("   quantity : " + livre.getQuantity()));
                    rightPanel.add(op);
                    x += 160; 
                    if (x > (10 + 3 * 160)) {
                        x = 10; 
                        y += 170; 
                    }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
            }
            
        };
        if (e.getSource() == usersButton)
        {
            chosenPanel = "users";
            {
                upPanel.removeAll();
                nameField.setBounds(60, 10, 100, 30);
                secondNameField.setBounds(320, 10, 100, 30);
                ageField.setBounds(60,50,100,30);
                emailField.setBounds(320,50,150,30);
                reset.setBounds(570,120,100,30);
                upPanel.add(nameField);
                upPanel.add(secondNameField);
                upPanel.add(ageField);
                upPanel.add(emailField);
                upPanel.add(delete);
                upPanel.add(reset);
                upPanel.add(edit);
                upPanel.revalidate();
                upPanel.repaint();
                mainFrame.validate();
            }
            {
               int x = 10;
                int y = 10; 
                rightPanel.removeAll();
                for (User user : users) 
                {
                   if (!user.getNom().equals("admin"))
                   {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 190, 160);
                        op.setBackground(Color.white);
                        op.add(new JLabel("name : " + user.getNom()));
                        op.add(new JLabel("   secName : " + user.getPrenom()));
                        op.add(new JLabel("   age   : " + user.getAge()));
                        op.add(new JLabel("   email : " + user.getEmail()));
                        rightPanel.add(op);
                        x += 190; 
                        if (x > (10 + 3 * 190)) {
                            x = 10; 
                            y += 170; 
                        }
                   }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
            }
        };
        if (e.getSource() == loansButton)
        {
            chosenPanel = "loans";
            {
                upPanel.removeAll();
                idField.setBounds(140, 20, 100, 30);
                search.setBounds(250, 20, 100, 30);
                search.addActionListener(this);
                dayField.setBounds(140, 70, 100, 30);
                monthField.setBounds(310, 70, 100, 30);
                yearField.setBounds(460,70,100,30);
                extend.setBounds(560,70,100,30);
                extend.addActionListener(this);
                upPanel.add(extend);
                upPanel.add(dayField);
                upPanel.add(monthField);
                upPanel.add(yearField);
                upPanel.add(idField);
                upPanel.add(search);
                upPanel.revalidate();
                upPanel.repaint();
                mainFrame.validate();
            }
            {
                int x = 10;
                int y = 10; 
                rightPanel.removeAll();
                for (Loan emprunt : loans) 
                {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 170, 160);
                        op.setBackground(Color.white);
                        op.add(new JLabel("user id: " + emprunt.getId()));
                        op.add(new JLabel("   book name : " + emprunt.getTitleName()));
                        op.add(new JLabel("   LD : " +emprunt.getLD()));
                        op.add(new JLabel("  BD : " + emprunt.getBD()));
                        rightPanel.add(op);
                        rightPanel.revalidate();
                        rightPanel.repaint();
                        mainFrame.validate();
                        x += 180; 
                        if (x > (10 + 3 * 180)) {
                            x = 10; 
                            y += 180; 
                        }
                }
            }
        };
        if (e.getSource() == backButton){

            upPanel.removeAll();
            upPanel.revalidate();
            upPanel.repaint();
                
                int x = 10;
                int y = 10; 
                rightPanel.removeAll();
            for (Back retour : backs) 
                {
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 190, 160);
                    op.setBackground(Color.white);
                    op.add(new JLabel("user id: "  + retour.getEmprunt().getId()));
                    op.add(new JLabel("   book : " + retour.getEmprunt().getTitleName()));
                    op.add(new JLabel("   BD : " + retour.getDateRetour()));
                    op.add(new JLabel(" EBD : " + retour.getEmprunt().getBD()));

                    if (retour.getDateRetour().isAfter(retour.getEmprunt().getBD()))
                    {
                        ImageIcon warnning = new ImageIcon("src/main/java/org/example/warning.png");
                        Image warningscaledImage = warnning.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                        ImageIcon warningscaledImageIcon = new ImageIcon(warningscaledImage);
                        JLabel warningimageLabel = new JLabel(warningscaledImageIcon);
                        op.add(warningimageLabel);
                        for (User u : users)
                            if (u.getId() == retour.getEmprunt().getId())
                                    u.setBaned(true); 
                    }
                        rightPanel.add(op);
                        rightPanel.revalidate();
                        rightPanel.repaint();
                        mainFrame.validate();
                        x += 190; 
                        if (x > (10 + 3 * 190)) {
                            x = 10; 
                            y += 190; 
                        }
                }
        };
        if (e.getSource() == filter){

            rightPanel.removeAll();
            rightPanel.revalidate();
            rightPanel.repaint();
            {
                int x = 10;
                int y = 10; 
                rightPanel.removeAll();
            
                for (Book livre : books) {
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 150, 150);
                    op.setBackground(Color.white);       
                    op.add(new JLabel("title : " + livre.getTitle()));
                    op.add(new JLabel("   author : " + livre.getAuthor()));
                    op.add(new JLabel("   PD : " + livre.getPd()));
                    op.add(new JLabel("   type : " + livre.getType()));
                    op.add(new JLabel("   quantity : " + livre.getQuantity()));
                    rightPanel.add(op);
                    {
                        JPanel dispo = new JPanel();
                        dispo.setSize(50,50);
                        dispo.setBackground(((livre.getQuantity() == 0)? Color.RED : Color.GREEN));
                        op.add(dispo);
                    }
                    x += 160; 
                    if (x > (10 + 3 * 160)) {
                        x = 10; 
                        y += 170; 
                    }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
            }



        }
        if (e.getSource() == generalButton)
        {

            upPanel.removeAll();
            upPanel.revalidate();
            upPanel.repaint();
            rightPanel.removeAll();
            rightPanel.revalidate();
            rightPanel.repaint();

            ArrayList<Book> mostWantedLivres = (ArrayList<Book>)books.stream().filter(lv -> lv.getQuantity() < 10).collect(Collectors.toList());
            JPanel o = new JPanel();
            o.setBounds(100, 0, 200, 30);
            o.add(new JLabel("the most wanted books "));


            ImageIcon like = new ImageIcon("src/main/java/org/example/like.png");
            Image likeImg = like.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ImageIcon likeImgscaled = new ImageIcon(likeImg);
            JLabel likelabel = new JLabel(likeImgscaled);
            o.add(likelabel);


            rightPanel.add(o);

            int i = 11;

            {
                for (Book livre : mostWantedLivres)
                {
                    i+=10;
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(100, 10 + i, 100, 30);
                    op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                    op.setBackground(Color.white);
                    op.add(new JLabel("title : " + livre.getTitle()));
                    rightPanel.add(op);
                    rightPanel.revalidate();
                    rightPanel.repaint();
                    mainFrame.validate();
                    i+= 40;
                }
            }

            JPanel oo = new JPanel();
            oo.setBounds(100, i + 10, 200, 30);
            oo.add(new JLabel("the most active users  "));


            ImageIcon active = new ImageIcon("src/main/java/org/example/king.png");
            Image activeImg = active.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ImageIcon activeScaledImg = new ImageIcon(activeImg);
            JLabel activeLable = new JLabel(activeScaledImg);
            oo.add(activeLable);

            rightPanel.add(oo);
            {   
                ArrayList<Integer> ids = (ArrayList<Integer>) loans.stream().map(em -> em.getId()).collect(Collectors.toList());
                ArrayList<Integer> duplicated = (ArrayList<Integer>) ids.stream().filter(el -> (ids.indexOf(el) != ids.lastIndexOf(el)) ).collect(Collectors.toList());
                
                i+=20;
                for (User user : users)
                {
                    if (duplicated.contains(user.getId()) && !user.getNom().equals("admin"))
                    {
                        i += 10;
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(100, 10 + i, 200, 30);
                        op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                        op.setBackground(Color.white);
                        op.add(new JLabel("   email : " + user.getEmail()));
                        rightPanel.add(op);
                        rightPanel.revalidate();
                        rightPanel.repaint();
                        mainFrame.validate();
                        i += 40;
                    }
                }
            }



        }
        if (e.getSource() == logoutButton)
        {
            new Login(books, users, loans, backs);
            mainFrame.dispose();
        };
        if (e.getSource() == delete)
        {   
            if (chosenPanel.equals("books"))
                if (!titleField.getText().equals("")){
                    books = (ArrayList<Book>)books.stream().filter(livre -> !livre.getTitle().equals(titleField.getText())).collect(Collectors.toList());
                    books.sort(null);
                    rightPanel.removeAll();
                    {
                        int x = 10;
                        int y = 10; 
                        rightPanel.removeAll();
                        for (Book livre : books) {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 150, 150);
                        op.setBackground(Color.white);       
                        op.add(new JLabel("title : " + livre.getTitle()));
                        op.add(new JLabel("   author : " + livre.getAuthor()));
                        op.add(new JLabel("   PD : " + livre.getPd()));
                        op.add(new JLabel("   type : " + livre.getType()));
                        op.add(new JLabel("   quantity : " + livre.getQuantity()));
                        rightPanel.add(op);
                        x += 160; 
                    if (x > (10 + 3 * 160)) {
                        x = 10;
                        y += 170;
                    }
                }
            
                    rightPanel.revalidate();
                    rightPanel.repaint();
                    mainFrame.validate();
                        if (books.size() == 0)
                        {
                            rightPanel.removeAll();
                            rightPanel.revalidate();
                            rightPanel.repaint();
                            mainFrame.validate();
                        }

                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please enter a title before proceeding.", "Empty Title", JOptionPane.WARNING_MESSAGE);

                }

            if (chosenPanel.equals("users")){

                if (!emailField.getText().equals("")){
                    users = (ArrayList<User>)users.stream().filter(u -> !u.getEmail().equals(emailField.getText())).collect(Collectors.toList());
                    users.sort(null);

                    {
                        int x = 10;
                        int y = 10; 
                        rightPanel.removeAll();
                        for (User user : users) 
                        {
                            if (!user.getNom().equals("admin"))
                            {
                                JPanel op = new JPanel();
                                op.addMouseListener(this);
                                op.setBounds(x, y, 160, 160);
                                op.setBackground(Color.white);
                                op.add(new JLabel("name : " + user.getNom()));
                                op.add(new JLabel("   sName : " + user.getPrenom()));
                                op.add(new JLabel("   age : " + user.getAge()));
                                op.add(new JLabel("   email : " + user.getEmail()));
                                rightPanel.add(op);
                                x += 170; 
                                if (x > (10 + 3 * 170)) {
                                    x = 10; 
                                    y += 170; 
                            }
                         
                        if (users.size() == 0)
                        {
                            rightPanel.removeAll();
                            rightPanel.revalidate();
                            rightPanel.repaint();
                            mainFrame.validate();
                        }
                    }

                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
                    }
                    
               
                }
                else
                {
                     JOptionPane.showMessageDialog(null, "Please enter an email before proceeding.", "Empty email", JOptionPane.WARNING_MESSAGE);
                };
            }
            e.setSource(reset);
        };
        if (e.getSource() == add)
        {
            if (chosenPanel.equals("books"))
                if (!titleField.getText().equals("") && !authorField.getText().equals("") && !pdField.getText().equals("") && !typeField.getText().equals("") && !quantityField.getText().equals(""))
                {
                    Book Livre = new Book(books.get(books.size() - 1).getId() + 1, titleField.getText(), authorField.getText(), pdField.getText(), typeField.getText(),Integer.parseInt(quantityField.getText()));
                    books.add(Livre);
                    
                        int x = 10;
                        int y = 10;
                        rightPanel.removeAll();
            
                    for (Book livre : books) {
                        JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 150, 150);
                    op.setBackground(Color.white);       
                    op.add(new JLabel("title : " + livre.getTitle()));
                    op.add(new JLabel("   author : " + livre.getAuthor()));
                    op.add(new JLabel("   PD : " + livre.getPd()));
                    op.add(new JLabel("   type : " + livre.getType()));
                    op.add(new JLabel("   quantity : " + livre.getQuantity()));
                    rightPanel.add(op);
                    x += 160; 
                    if (x > (10 + 3 * 160)) {
                        x = 10; 
                        y += 170;
                    }
                }
                    rightPanel.revalidate();
                    rightPanel.repaint();
                    mainFrame.validate();
                }
                else {
                    System.out.println("one of the fields is empty");
                };
            e.setSource(reset);
        };
        if (e.getSource() == edit)
        {
            if (chosenPanel.equals("books"))
            {
                if (!titleField.getText().equals(""))
                {
                    Book newlivre = new Book(idPrime, titleField.getText(), authorField.getText(), pdField.getText(), typeField.getText(),Integer.parseInt(quantityField.getText()));
                books = (ArrayList<Book>)books.stream().filter(livre -> livre.getId() != idPrime).collect(Collectors.toList());
                books.add(newlivre);
                books.sort(null);
                
                int x = 10;
                int y = 10;
                rightPanel.removeAll();
            
                for (Book livre : books) {
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 150, 150);
                    op.setBackground(Color.white);       
                    op.add(new JLabel("title : " + livre.getTitle()));
                    op.add(new JLabel("   author : " + livre.getAuthor()));
                    op.add(new JLabel("   PD : " + livre.getPd()));
                    op.add(new JLabel("   type : " + livre.getType()));
                    op.add(new JLabel("   quantity : " + livre.getQuantity()));
                    rightPanel.add(op);
                    x += 160;
                    if (x > (10 + 3 * 160)) {
                        x = 10;
                        y += 170;
                    }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
                }else 
                {
                     JOptionPane.showMessageDialog(null, "Please enter a title before proceeding.", "Empty Title", JOptionPane.WARNING_MESSAGE);
                }

            }
            if (chosenPanel.equals("users")){
                
                User newUser = new User(idPrime, nameField.getText(), secondNameField.getText(), Integer.parseInt(ageField.getText()), emailField.getText(),false);
                users = (ArrayList<User>)users.stream().filter(user -> user.getId() != idPrime).collect(Collectors.toList());
                users.add(newUser);
                users.sort(null);
                {
               int x = 10;
                int y = 10; 
                rightPanel.removeAll();
                for (User user : users) 
                {
                   if (!user.getNom().equals("admin"))
                   {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 160, 160);
                        op.setBackground(Color.white);
                        op.add(new JLabel("name : " + user.getNom()));
                        op.add(new JLabel("   sName : " + user.getPrenom()));
                        op.add(new JLabel("   age : " + user.getAge()));
                        op.add(new JLabel("   email : " + user.getEmail()));
                        rightPanel.add(op);
                        x += 170; 
                        if (x > (10 + 3 * 170)) {
                            x = 10; 
                            y += 170; 
                        }
                   }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
            }
                idPrime = 0;
            }
            e.setSource(reset);
        };
        if (e.getSource() == reset)
        {
            if (chosenPanel.equals("books")){

                titleField.setText("");
                authorField.setText("");
                pdField.setText("");
                typeField.setText("");
                quantityField.setText("");
                upPanel.revalidate();
                upPanel.repaint();;
                mainFrame.validate();

            }
            else if (chosenPanel.equals("users")){

                nameField.setText("");
                secondNameField.setText("");
                ageField.setText("");
                emailField.setText("");
                upPanel.revalidate();
                upPanel.repaint();
                mainFrame.validate();

            }
        }
        if (e.getSource() == search)
        {
            if(chosenPanel.equals("books"))
            {
                ArrayList<Book> searchedLivres = (ArrayList<Book>)books.stream().filter(lv ->
                        (lv.getTitle().equals(authorField.getText()) || lv.getType().equals(typeField.getText()) || lv.getPd().equals(pdField.getText()))
                ).collect(Collectors.toList());
                {
                          int x = 10;
                    int y = 10;
                    rightPanel.removeAll();
            
                    for (Book livre : searchedLivres) {
                    JPanel op = new JPanel();
                    op.addMouseListener(this);
                    op.setBounds(x, y, 150, 150);
                    op.setBackground(Color.white);       
                    op.add(new JLabel("title : " + livre.getTitle()));
                    op.add(new JLabel("   author : " + livre.getAuthor()));
                    op.add(new JLabel("   PD : " + livre.getPd()));
                    op.add(new JLabel("   type : " + livre.getType() ));
                    op.add(new JLabel("   quantity : " + livre.getQuantity()));
                    rightPanel.add(op);
                    x += 160;
                    if (x > (10 + 3 * 160)) {
                        x = 10;
                        y += 170;
                    }
                }
                rightPanel.revalidate();
                rightPanel.repaint();
                mainFrame.validate();
                }


            }
            else if (!idField.getText().equals("")){

                if (chosenPanel.equals("loans"))
                {
                    idPrime = Integer.parseInt(idField.getText());
                    var newEmprunts = (ArrayList<Loan>)loans.
                            stream().filter(emprunt -> emprunt.getId() == idPrime).
                            collect(Collectors.toList());
                    newEmprunts.sort(null);
            
                    int x = 10;
                    int y = 10; 
                    rightPanel.removeAll();
                    for (Loan emprunt : newEmprunts) 
                    {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 170, 160);
                        op.setBackground(Color.white);
                        op.add(new JLabel("user id: " + emprunt.getId()));
                        op.add(new JLabel("   book name : " + emprunt.getTitleName()));
                        op.add(new JLabel("   LD : " +emprunt.getLD()));
                        op.add(new JLabel("  BD : " + emprunt.getBD()));

                        rightPanel.add(op);
                        rightPanel.revalidate();
                        rightPanel.repaint();
                        mainFrame.validate();
                        x += 180; 
                        if (x > (10 + 3 * 180)) {
                            x = 10; 
                            y += 180; 
                        }
                    }
                    idPrime = 0;
                }
            }else {
                {
                    {
                        int i = 0;
                        rightPanel.removeAll();
                        for (Loan emprunt: loans)
                        {
                            i+=10;
                            JPanel op = new JPanel();
                            op.addMouseListener(this);
                            op.setBounds(100, 10 + i, 600, 30);
                            op.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 3));
                            op.setBackground(Color.gray);
                            op.add(new JLabel("user id: " + emprunt.getId() + "   book name : " + emprunt.getTitleName() + "   LD : " +emprunt.getLD() + "  BD : " + emprunt.getBD()));
                            rightPanel.add(op);
                            rightPanel.revalidate();
                            rightPanel.repaint();
                            mainFrame.validate();
                            i+= 40;
                        }
                    }
                }
                idPrime = 0;
            }
        }
        if (e.getSource() == extend)
        {

            int j = 0;
            int id = Integer.parseInt(idField.getText());
            for (Loan em : loans){
                if (em.getId() == id && em.getTitleName().equals(gbookName))
                {
                    Loan ne = new Loan(gbookName,em.getId(),em.getLD(), LocalDate.of(Integer.parseInt(yearField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(dayField.getText())));
                    loans.remove(j);
                    loans.add(ne);
                    loans.sort(null);
                    gbookName = "";
                    break;
                }
                j++;
            }

                int x = 10;
                int y = 10; 
                rightPanel.removeAll();
                for (Loan emprunt : loans) 
                {
                        JPanel op = new JPanel();
                        op.addMouseListener(this);
                        op.setBounds(x, y, 170, 160);
                        op.setBackground(Color.white);
                        op.add(new JLabel("user id: " + emprunt.getId()));
                        op.add(new JLabel("   book name : " + emprunt.getTitleName()));
                        op.add(new JLabel("   LD : " +emprunt.getLD()));
                        op.add(new JLabel("  BD : " + emprunt.getBD()));
                        rightPanel.add(op);
                        rightPanel.revalidate();
                        rightPanel.repaint();
                        mainFrame.validate();
                        x += 180; 
                        if (x > (10 + 3 * 180)) {
                            x = 10; 
                            y += 180; 
                        }
                }
            {
                idField.setText("");
                monthField.setText("");
                dayField.setText("");
                yearField.setText("");
                upPanel.revalidate();
                upPanel.repaint();
                mainFrame.validate();
            }
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        if (e.getSource() instanceof JPanel) {
            JPanel clickedPanel = (JPanel) e.getSource();

            if (clickedPanel.getComponentCount() > 0 && clickedPanel.getComponent(0) instanceof JLabel ) {
                if (chosenPanel.equals("books"))
                {
                    JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
                    String name = titleLabel.getText().split(" ")[2];
                    Book book  = null;
                    for (Book lv : books)
                        if (lv.getTitle().equals(name))
                            book = lv;
                    {
                        titleField.setText(book.getTitle());
                        authorField.setText(book.getAuthor());
                        pdField.setText(book.getPd());
                        typeField.setText(book.getType());
                        quantityField.setText(Integer.toString(book.getQuantity()));
                        idPrime = book.getId();
                        upPanel.revalidate();
                        upPanel.repaint();
                        mainFrame.validate();
                    }
                }
                else if (chosenPanel.equals("users")){
                    JLabel titleLabel = (JLabel) clickedPanel.getComponent(0);
                    String name = titleLabel.getText().split(" ")[2];
                    User user = null;
                    for (User u : users)
                        if (u.getNom().equals(name))
                            user = u;
                    {
                        nameField.setText(user.getNom());
                        secondNameField.setText(user.getPrenom());
                        ageField.setText(Integer.toString(user.getAge()));
                        emailField.setText(user.getEmail());
                        idPrime = user.getId();
                        upPanel.revalidate();
                        upPanel.repaint();
                        mainFrame.validate();
                    }
                }
                else if (chosenPanel.equals("loans")){
                    JLabel p1 = (JLabel) clickedPanel.getComponent(0);                    
                    JLabel p2 = (JLabel) clickedPanel.getComponent(1);
                    int userId = Integer.parseInt(p1.getText().split(" ")[2]);
                    String bookName = p2.getText().split(" ")[6];

                    Loan emprunt = null;

                    for (Loan em : loans){
                        if (em.getId() == userId && em.getTitleName().equals(bookName))
                        {
                            emprunt = em;
                            break;
                        }
                    }
                    {
                        gbookName = emprunt.getTitleName();
                        idField.setText(Integer.toString(emprunt.getId()));
                        dayField.setText(Integer.toString(emprunt.getBD().getDayOfMonth()));
                        monthField.setText(Integer.toString(emprunt.getBD().getMonthValue()));
                        yearField.setText(Integer.toString(emprunt.getBD().getYear()));
                        upPanel.revalidate();
                        upPanel.repaint();
                        mainFrame.validate();
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
