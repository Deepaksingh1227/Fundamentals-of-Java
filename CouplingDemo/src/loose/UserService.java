package loose;

public class UserService {

    public UserService(){

    }
// for field dependency injection make it to public
     public NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService= notificationService;
    }


    public void setNotificationService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
}

