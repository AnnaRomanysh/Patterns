package behavioral.command;

public class PayForPurchaseCommand implements Command {
    Service service;

    public PayForPurchaseCommand(Service service) {
        this.service = service;
    }

    @Override
    public void executeCommad() {
        service.payForPurchase();
    }
}
