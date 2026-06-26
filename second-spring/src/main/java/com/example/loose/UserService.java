package com.example.loose;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UserServiceSMS")
public class UserService {
    //    @Autowired
    public NotificationService notificationService;

    public UserService(){
        // default constructor
    }

//    @Autowired
//    public UserService(@Qualifier("emailNotificationService") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    @Autowired
    public UserService( NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg){
        notificationService.send("Notification hello " + msg);
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
