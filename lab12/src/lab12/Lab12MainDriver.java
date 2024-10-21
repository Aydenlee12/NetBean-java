/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab12;

/**
 *
 * @author ayden
 */
import java.util.Scanner;


public class Lab12MainDriver {
     private static char getCharAtIndex(String s, int k) throws StringIndexOutOfBoundsException {
        if (k < 0 || k >= s.length()) {
            throw new StringIndexOutOfBoundsException("The given index is not within the valid index range.");
        }

        return s.charAt(k);
    }

    private static String stringFirstHalf(String s) throws OddLengthStringException {
        int length = s.length();
        if (length % 2 == 1) {
            throw new OddLengthStringException();
        }

        int halfLength = length / 2;
        return s.substring(0, halfLength);
    }
    //private static String stringFristHalf(String s)throw Exception  
    /**He
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter an index (integer): ");
        int k = 0;

        try {
            k = scanner.nextInt();

            // Check if index is negative
            if (k < 0) {
                throw new InvalidNegativeIndexException();
            }

            // Display the character at index k
            try {
                char charAtIndex = getCharAtIndex(s, k);
                System.out.println("Character at index " + k + ": " + charAtIndex);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Call stringFirstHalf method
            try {
                String firstHalf = stringFirstHalf(s);
                System.out.println("First half of the string: " + firstHalf);
            } catch (OddLengthStringException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer for the index.");
        } catch (InvalidNegativeIndexException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    