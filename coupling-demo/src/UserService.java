public class UserService {
    NotificationService notificationService = new NotificationService();
    public void notifyUser(String msg){
        notificationService.send(msg);
    }
}
