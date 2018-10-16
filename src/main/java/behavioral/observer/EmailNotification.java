package behavioral.observer;

public class EmailNotification implements Observer {

    @Override
    public void handle(String userEmail) {
        System.out.println("Send via email that user's email was changed to: "+userEmail);
    }
}
