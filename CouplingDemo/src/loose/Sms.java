package loose;

public class Sms implements NotificationService{

    @Override
    public void  send(String message){
        System.out.println("Sms :"+ message);
    }
}
