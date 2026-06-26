package com.example.db;


import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private List<String> users;

    public void init(){
        users = new ArrayList<>();
        System.out.println("DB Connected (Simulated)");
    }

    public List<String> getUsers(){
        return users;
    }

    public void addUsers(String user){
        users.add(user);
    }

    public void cleanUp(){
        System.out.println("DB Disconnected (Simulated)");
    }
}
