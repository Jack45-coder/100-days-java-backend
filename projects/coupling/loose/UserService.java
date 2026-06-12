package coupling.loose;
import coupling.loose.NotificationService;

public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg){
        notificationService.send("Notification hello " + msg);
    }
}
