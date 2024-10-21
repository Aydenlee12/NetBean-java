/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13extra;

/**
 *
 * @author ayden
 */
public class MainDriver {

     public static void countDown(int n) {
        // TODO code application logic here
        
        if(n<=0){
            System.out.println(0);
        }   
        else{
            System.out.println(n);
            countDown(n-1);
        }
    }
    public static int firstNSum(int n){
        if(n<=1){
            return n;
        }
        else{
            return n+firstNSum(n-1);
        }
    }
    public static int factorial(int n){
        if(n<=0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    public static String reverseString(String s){
        if(s.length()<= 1){
            return s;
        }
        else{
           return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
    public static boolean isPalindrome(String s){
        if(s.length()<= 1){
            return true;
        }
        else if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        else{
        return false;
        }
    }
        public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        countDown(n);
        System.out.println(firstNSum(n));
        System.out.println(factorial(n));
        System.out.println(reverseString("Hello"));
        System.out.println(isPalindrome("abcdcba"));
    }
}