package behavioral.observer;

public class MobileNotification implements Observer {
    @Override
    public void handle(String userEmail) {
        System.out.println("Send via mobile that user's email was changed to: "+userEmail);
    }
}
