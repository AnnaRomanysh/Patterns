package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users= new ArrayList<>();

    public void setAdmin(User admin){
        this.admin=admin;
    }
    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void sendMessage(String message, User user) {
        users.forEach(us->us.getMessage(message));
        admin.getMessage(message);

    }
}
