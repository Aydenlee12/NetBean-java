/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayden
 */
public abstract class Account {
    private int accountNo;
    private Customer accountHolder;
    private double amount;
    private static int lastAccountNo = 10000;

    public Account(Customer accountHolder, double amount) {
        this.accountNo = getNextAccountNo();
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    public abstract double yearEndAmount();

    // Getters and setters for instance variables
    public int getAccountNo() {
        return accountNo;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter and setter for nextAccountNo
    public static int getNextAccountNo() {
        lastAccountNo += 5;
        return lastAccountNo;
    }
}
