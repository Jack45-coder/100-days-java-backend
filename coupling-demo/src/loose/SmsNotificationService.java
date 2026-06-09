package loose;

public class SmsNotificationService implements NotificationService{
    public void send(String msg){
        System.out.println("SMS: " +msg);
    }
}
