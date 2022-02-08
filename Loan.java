package T3;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
    public  Loan(){

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate = new Date();
    }

    public double getMonthlyPayment(){
        Integer totalMonth = this.getNumberOfYears()*12;
        double monthlyInterest = (this.getAnnualInterestRate()/100)/12;
        double monthly = ((this.getLoanAmount() * monthlyInterest) / 1)/(1-(1/Math.pow((1+monthlyInterest),totalMonth)));
        return monthly;
    }
    public double getTotalPayment(){
        Double totalPayment = this.getMonthlyPayment()*(this.getNumberOfYears()*12);

        return totalPayment;
    }

}
