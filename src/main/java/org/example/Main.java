package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.addAll(new Data().getUsers());
        
        ArrayList<Book> livers = new ArrayList<>();
        livers.addAll(new Data().getBooks());
        
        ArrayList<Loan> emprunts = new ArrayList<>();
        emprunts.addAll(new Data().getLoans());
        
        ArrayList<Back> retours = new ArrayList<>();
        retours.addAll(new Data().getReturns());

        // lunch the first frame 
        Login firstFrame = new Login(livers,users,emprunts,retours);
        
    }
}