package FullTimePartTime;

import java.util.Scanner;

interface IEmployee {
    int calculateSalary();
    String getName();
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PTE
        System.out.print("Calculate salary of PartTimeEmployee: \n");
        System.out.print("Type name: ");
        String ptename = sc.nextLine();
        System.out.print("Type paymentPerHour: ");
        int ptepaymentPerHour = Integer.parseInt(sc.nextLine());
        System.out.print("Type workingHours: ");
        int pteworkingHour = Integer.parseInt(sc.nextLine());
        IEmployee pte = new PartTimeEmployee(ptename, ptepaymentPerHour, pteworkingHour);
        System.out.println("Salary of " + pte.getName() + ": " + pte.calculateSalary());

        //FTE
        System.out.print("Calculate salary of FullTimeEmployee: \n");
        System.out.print("Type name: ");
        String ftename = sc.nextLine();
        System.out.print("Type paymentPerHour: ");
        int ftepaymentPerHour = Integer.parseInt(sc.nextLine());
        IEmployee fte = new FullTimeEmployee(ftename, ftepaymentPerHour);
        System.out.println("Salary of " + fte.getName() + ": " + fte.calculateSalary());
    }
}