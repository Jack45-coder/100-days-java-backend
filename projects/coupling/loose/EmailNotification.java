package coupling.loose;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("Email Notification: " + msg);
    }
}
