import loose.EmailNotificationService;
import loose.NotificationService;
import loose.SmsNotificationService;
import tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        // tight
        UserService userService = new UserService();
        userService.notifyUser("Ordered Placed");

        // loose
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SmsNotificationService();
        loose.UserService userServiceLoose = new loose.UserService(emailService);
        loose.UserService userServiceLoose1 = new loose.UserService(smsService);

        userServiceLoose.notifyUser("Order Processed");
        userServiceLoose1.notifyUser("Placed Your Order Track Now");
    }
}
