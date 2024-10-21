/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classactivity1127;
import java.util.Scanner;
import java.util.InputMismatchException ;
/**
 *
 * @author ayden
 */
public class MainDriver {
        public static int calculateDifference(int x, int y) {
        return y - x;
    }

    public static void checkNegativeDifference(int x, int y) throws IllegalArgumentException {
        int difference = calculateDifference(x, y);
        if (difference < 0) {
            throw new IllegalArgumentException("The difference (y - x) cannot be negative");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        try{
        System.out.println("Give me a positive number");
        int x = scnr.nextInt();
        System.out.println("Give me another positive number");
        int y = scnr.nextInt();
       
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Can't be a negative number");
        }
        int sum = x + y;
        System.out.println("The sum of both numbers is " + sum);
        
        try {
            checkNegativeDifference(x, y);

            // Continue with the rest of your code if the difference is not negative
            int difference = calculateDifference(x, y);
            System.out.println("Difference is: " + difference);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        }
        catch(InputMismatchException e){
            System.out.println("Not a number");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
    }
          
}
