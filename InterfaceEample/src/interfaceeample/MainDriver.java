/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceeample;

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
        
        Circle c = new Circle(2.5);
        System.out.println(c.area());
        Shape s;
        
        s = new Circle(3.5);
        System.out.println(s.area());
    }
    
}
