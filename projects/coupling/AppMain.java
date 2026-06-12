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


        /*
        Constructor Injection - dependency is provided vai constructor
        Setter Injection - dependency is provided via setter method
        Field Injection - dependency is assigned directly to a field
         */

//        Setter Injection - dependency is provided via setter method
        coupling.loose.UserService userService3 = new coupling.loose.UserService();
        userService3.setNotificationService(emailService); // setter injection
        userService3.notificationService = smsService; // field injection
    }
}
