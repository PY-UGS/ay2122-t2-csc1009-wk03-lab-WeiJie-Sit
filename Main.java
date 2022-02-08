package T3;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner((System.in));
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interest = input.nextFloat();
        System.out.print("Enter number of years as an integer: ");
        Integer year = input.nextInt();
        System.out.print("Enter Loan amount , for example, 120000.95: ");
        double amount = input.nextFloat();
        Loan loan = new Loan(interest,year,amount);
        System.out.println("The loan was created on"+loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\nThe total payment is %.2f",loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}
