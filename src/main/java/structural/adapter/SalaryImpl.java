package structural.adapter;

public class SalaryImpl implements Salary {
    public int calculateSalary(int... workingHours) {
        System.out.println("Calculate salry");
        int sum = 0;
        int salary=0;
        for (int i = 0; i < workingHours.length; i++) {
            sum += workingHours[i];
        }
        salary=sum*10;
        System.out.println(salary);
        return salary;
    }
}
