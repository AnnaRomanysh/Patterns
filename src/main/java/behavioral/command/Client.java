package behavioral.command;

public class Client {
    private Command createPurchuse;
    private Command payForPurchuse;

    Client(Command createPurchuse, Command payForPurchuse) {
        this.createPurchuse = createPurchuse;
        this.payForPurchuse = payForPurchuse;
    }

    public void createPurchuse() {
        createPurchuse.executeCommad();
    }

    public void payForPurchase() {
        payForPurchuse.executeCommad();
    }
}
