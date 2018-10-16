package behavioral.command;

import behavioral.mediator.User;

public class Usage {

    public static void main(String[] args){
        Service amazon = new Amazon();
        Client client = new Client(new CreatePurchuseCommand(amazon), new PayForPurchaseCommand(amazon));
        client.createPurchuse();
        client.payForPurchase();
    }
}
