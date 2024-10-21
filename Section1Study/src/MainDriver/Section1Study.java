/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainDriver;

/**
 *
 * @author ayden
 */
public class Section1Study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        
        
        
        String userStr = "Doghouse";
        char x = Character.toLowerCase(userStr.charAt(2));
        System.out.println(x);
        
        System.out.println();
        
        String uni = "Augsburg";
        System.out.println(uni.substring(2, 7));
        System.out.println(uni.substring(0,uni.length()));
        
        System.out.println();
        
        int n=3;
        for(int i = 1; i <= n; ++i){
            int fact =1;
            fact = fact *i;
            System.out.println(fact);
        }
        
        
    }
    
}
