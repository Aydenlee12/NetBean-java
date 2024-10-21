/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author ayden
 * Recursion lecture
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
public static void main(String[] args){
    int n = 5;

    }
    
}
