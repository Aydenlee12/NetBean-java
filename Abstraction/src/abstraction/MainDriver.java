/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction;

/**
 *
 * @author ayden
 */
import java.util.ArrayList;
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Since Shape2D is abstract, you cant call to the object but you can make a refrences of it 
        Shape2D d;
        Square sq1 = new Square(5,4,4);
        Square sq2 = new Square(6,4,4);
        Square sq3 = new Square(8,4,4);
        
        Circle c1 = new Circle(3,0,0);
        Circle c2 = new Circle(5,0,0);
        
        ArrayList<Shape2D> arr = new ArrayList<Shape2D>();
        
        arr.add(sq1);
        arr.add(sq2);
        arr.add(sq3);
        arr.add(c1);
        arr.add(c2);
    // This for loop makes it so it iterates each element 
        for(Shape2D s: arr){
            System.out.println(s.area());
        }
       // You can assign an abstract refrence to a different refrence that calls its object to then take there objects
        d = sq1;
        
        System.out.println(d.area());
        
        
        
    }
    
}
