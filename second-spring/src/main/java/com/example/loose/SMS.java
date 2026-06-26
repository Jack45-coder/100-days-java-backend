package com.example.loose;

import org.springframework.stereotype.Component;

@Component
public class SMS implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("");
    }
}
