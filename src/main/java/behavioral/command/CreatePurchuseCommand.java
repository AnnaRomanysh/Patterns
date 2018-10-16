package behavioral.command;

public class CreatePurchuseCommand implements Command {
    Service service;

    public CreatePurchuseCommand(Service service){
        this.service=service;
    }
    @Override
    public void executeCommad() {
        service.createPurchase();
    }
}
