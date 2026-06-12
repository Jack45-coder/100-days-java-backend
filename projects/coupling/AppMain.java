package coupling;

import coupling.loose.EmailNotification;
import coupling.loose.NotificationService;
import coupling.loose.SMS;
import coupling.tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        // Tight
        UserService userService = new UserService();
        userService.notifyUser("Order Placed");

        // Loose
        NotificationService emailService = new EmailNotification();
        NotificationService smsService = new SMS();
        coupling.loose.UserService userService1 = new coupling.loose.UserService(emailService);
        coupling.loose.UserService userService2 = new coupling.loose.UserService(smsService);
        userService1.notifyUser("Order Done");   // email
        userService2.notifyUser("Order Placed"); // sms
    }
}
