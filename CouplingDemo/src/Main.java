import loose.EmailNotificationService;
import loose.NotificationService;
import loose.Sms;
import tightCoupling.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//tight coupling
        UserService userService =new UserService();
       userService.notifyUser("Hello");
//Loose coupling
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.send("Hello Deepak\n");

        NotificationService smsNotificationService= new Sms();
        smsNotificationService.send("hlo Shiv");

//dependency injection using setter Injection


        loose.UserService userServiceSetter= new loose.UserService();
        userServiceSetter.setNotificationService(emailNotificationService);

//to call for field dependency injection-------------------------------------
        userServiceSetter.notificationService=smsNotificationService;


    }

}