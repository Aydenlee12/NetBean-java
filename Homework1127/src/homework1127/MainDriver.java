/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1127;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ayden
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        try{
        System.out.println("Give me a number");
        int n = scnr.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i< n; ++i){
            arr[i] = rand.nextInt(99)+1;
        }
        System.out.println("Give me a number between 0 and " + (n-1));
        int k = scnr.nextInt();
        System.out.println("The random number at that location is " +arr[k]);
        }
        catch(NegativeArraySizeException e){
              System.out.println("Error: need to enter a postitive number");
        }
        catch(InputMismatchException e){
            System.out.println("Error: needs to be a valid number");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: number needs to be within the given number set");
        }
    }
} 
