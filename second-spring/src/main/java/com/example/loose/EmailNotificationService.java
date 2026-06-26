package com.example.loose;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("Email: " + msg);
    }
}
