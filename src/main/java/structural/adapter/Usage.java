package structural.adapter;

public class Usage {

    public static void main(String[] args) {
        Salary salary = new SalaryImpl();
        SalaryToPaymentAdapter salaryToPaymentAdapter = new SalaryToPaymentAdapter(salary);
        salaryToPaymentAdapter.calculatePaymentSum(1, 2, 3, 4, 5);

    }
}
