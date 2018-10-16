package behavioral.mediator;

public class Usage {

    public static void main(String [] args){
        TextChat textChat = new TextChat();
        User admin = new Admin(textChat);
        User commonUser = new SimpleUser(textChat);
        User anotherUser = new SimpleUser(textChat);

        textChat.setAdmin(admin);
        textChat.addUser(commonUser);
        textChat.addUser(anotherUser);
        commonUser.sendMessage("Hello, I'm first user");
    }
}
