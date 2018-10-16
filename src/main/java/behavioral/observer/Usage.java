package behavioral.observer;

public class Usage {
    public static void main(String[] args) {
        User user1 = new User();
        user1.addObserver(new EmailNotification());
        user1.addObserver(new MobileNotification());
        user1.setEmail("test@test.com");
        user1.setEmail("changed@emal.com");

    }
}
