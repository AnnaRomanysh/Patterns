package structural.adapter;

public class PaymentCalculationImpl implements PaymentCalculation {
    public int calculatePaymentSum(int... prices) {
        System.out.println("Calculate payment");
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        System.out.println(sum);
        return sum;
    }
}
