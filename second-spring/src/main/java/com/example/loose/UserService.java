package com.example.loose;


public class UserService {
    public NotificationService notificationService;

    public UserService(){
        // default constructor
    }

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg){
        notificationService.send("Notification hello " + msg);
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
