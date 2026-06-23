package com.example.loose;

public class SMS implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("SMS: "+msg);
    }
}
