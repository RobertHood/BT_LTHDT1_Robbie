package FullTimePartTime;

public class Employee {
    protected String name;
    protected int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public String getName() {
        return name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}

