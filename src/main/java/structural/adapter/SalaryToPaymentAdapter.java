package structural.adapter;

public class SalaryToPaymentAdapter implements PaymentCalculation {
    private Salary salary;


    public SalaryToPaymentAdapter(Salary salary) {
        this.salary = salary;
    }

    public int calculatePaymentSum(int... prices) {
        return salary.calculateSalary(prices);
    }
}
