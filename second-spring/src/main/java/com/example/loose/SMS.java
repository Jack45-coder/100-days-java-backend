package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMS implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("SMS: " + msg);
    }
}
