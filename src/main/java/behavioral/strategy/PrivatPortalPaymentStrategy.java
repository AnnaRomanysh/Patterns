package behavioral.strategy;

public class PrivatPortalPaymentStrategy implements PaymentStrategy {
    public void pay() {
        System.out.println("Pay using Privat 24 portal");
    }
}
