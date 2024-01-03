package org.example;

import java.util.ArrayList;

public class ListOfUsers {

    ArrayList<User> users = new ArrayList<>();
    ListOfUsers(){

        users.add(new User(0,"admin","admin",24,"admin","admin",false));
        users.add(new User(1,"user1","user1",24,"user1@gmail.com","123",false));
        users.add(new User(2,"user2","user2",24,"user2@gmail.com","123",false));
        users.add(new User(3,"user3","user3",24,"user3@gmail.com","123",false));
        users.add(new User(4,"user4","user4",24,"user4@gmail.com","123",false));
        users.add(new User(5,"user5","user5",24,"user5@gmail.com","123",false));
        
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
