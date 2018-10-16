package structural.proxy;

public class ATMproxy implements ATM {
    ATMimpl atMimpl;

    public ATMproxy() {
        atMimpl = new ATMimpl();
    }

    public float checkBalance() {
        float balance;
        /*
        check authentification
         */
        return atMimpl.checkBalance();
    }

    public void withdrawCash(int sum) {
        /*
        check authentification
         */
        atMimpl.withdrawCash(sum);
    }
}
