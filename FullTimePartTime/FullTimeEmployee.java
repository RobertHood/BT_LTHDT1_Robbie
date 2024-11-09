package FullTimePartTime;

public class FullTimeEmployee extends Employee implements IEmployee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    //Giả sử FullTimeEmployee làm việc 9-5 * 30 ngày (1 tháng)
    public int calculateSalary() {
        return getPaymentPerHour() * 8 * 30;
    }
}
