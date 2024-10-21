/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayden
 */
import java.util.Random;

public class CheckingAccount extends Account {
    private int numCheckBooks;

    public CheckingAccount(Customer accountHolder, double amount) {
        super(accountHolder, amount);
        this.numCheckBooks = new Random().nextInt(10) + 1;
    }

    // Getter and setter for numCheckBooks
    public int getNumCheckBooks() {
        return numCheckBooks;
    }

    public void setNumCheckBooks(int numCheckBooks) {
        this.numCheckBooks = numCheckBooks;
    }

    // Instance method for yearEndAmount
    @Override
    public double yearEndAmount() {
        return getAmount();
    }
}
