package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.addAll(new ListOfUsers().getUsers());
        new Login(users);
        
    }
}