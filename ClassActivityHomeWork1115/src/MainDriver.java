/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ayden
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sample usage of the classes
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        CheckingAccount checkingAccount = new CheckingAccount(customer, 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount(customer, 2000.0);

        System.out.println("Checking Account Number: " + checkingAccount.getAccountNo());
        System.out.println("Number of Checkbooks: " + checkingAccount.getNumCheckBooks());
        System.out.println("Checking Account Year-End Amount: " + checkingAccount.yearEndAmount());

        System.out.println("\nSavings Account Number: " + savingsAccount.getAccountNo());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
        System.out.println("Savings Account Year-End Amount: " + savingsAccount.yearEndAmount());
    }
    
}
