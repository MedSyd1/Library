package org.example;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;



public class Data {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();
    private ArrayList<Back>  returns  = new ArrayList<>();

    public Data()
    {
        // add some users 
        users.add(new User(0,"admin","admin",55,"admin","admin",false));
        users.add(new User(1,"mohammed","demran",25,"mohammed@gmail.com","0000",false));
        users.add(new User(2,"soufiane","yaman",22,"soufiane@gmail.com","0000",false));
        users.add(new User(3,"zakaria","moussami",24,"zakaria@gmail.com","0000",false));
        users.add(new User(4,"oussama","aboudan",24,"oussama@gmail.com","0000",false));
        users.add(new User(5,"mohammed","louafi",24,"louafi@gmail.com","0000",false));  
        
        // add some books
        books.add(new Book(1,"Mockingbird", "Harper", "1960", "Fiction", 0));
        books.add(new Book(2,"1984", "George", "1949", "Dystopian", 1));
        books.add(new Book(3,"Gatsby", "Fitzgerald", "1925", "Classic", 20));
        books.add(new Book(4,"Prejudice", "Austen", "1813", "Romance", 20));
        books.add(new Book(5,"Rye", "Salinger", "1951", "Coming-of-Age", 11));
        books.add(new Book(6,"Potter", "Rowling", "1997", "Fantasy", 5));
        books.add(new Book(7,"Rings", "Tolkien", "1954", "Fantasy", 20));
        books.add(new Book(8,"Games", "Collins", "2008", "Science", 20));
        books.add(new Book(9,"Code", "Brown", "2003", "Mystery", 0));
        books.add(new Book(10,"Hobbit", "Tolkien", "1937", "Fantasy", 20));

        // add some emmprunts 
        loans.add(new Loan("1984",1,LocalDate.of(2024,12,30),LocalDate.of(2024,1,20)));
        loans.add(new Loan("Hobbit",2,LocalDate.of(2024,12,16),LocalDate.of(2024,1,19)));
        loans.add(new Loan("Code",1,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));
        loans.add(new Loan("Potter",4,LocalDate.of(2024,12,20),LocalDate.of(2024,1,20)));
        loans.add(new Loan("1984",5,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));
        loans.add(new Loan("Games",2,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));


        // add some returns 
        returns.add(new Back(loans.get(0), LocalDate.of(2024,1,20)));
        returns.add(new Back(loans.get(1), LocalDate.of(2024,3,2)));
        returns.add(new Back(loans.get(2), LocalDate.of(2024,1,31)));
        returns.add(new Back(loans.get(3), LocalDate.of(2024,2,20)));
        returns.add(new Back(loans.get(4), LocalDate.of(2024,1,31)));

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<Back> getReturns() {
        return returns;
    }


    


    
}
