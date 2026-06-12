package coupling;

import coupling.loose.EmailNotification;
import coupling.loose.NotificationService;
import coupling.tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        // Tight
        UserService userService = new UserService();
        userService.notifyUser("Order Placed");

        // Loose
        NotificationService emailService = new EmailNotification();
        coupling.loose.UserService userService1 = new coupling.loose.UserService(emailService);
        userService1.notifyUser("Order Done");
    }
}
