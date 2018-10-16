package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void pay() {
        System.out.println("Pay using creded card");
    }
}
