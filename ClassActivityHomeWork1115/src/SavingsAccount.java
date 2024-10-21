/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayden
 */
public class SavingsAccount extends Account {
    private double interestRate = 0.05;

    public SavingsAccount(Customer accountHolder, double amount) {
        super(accountHolder, amount);
    }

    // Getter and setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Instance method for annualInterest
    public double annualInterest() {
        return interestRate * getAmount();
    }

    // Instance method for yearEndAmount
    @Override
    public double yearEndAmount() {
        return annualInterest() + getAmount();
    }
}
