/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author ayden
 */
public class Circle extends Shape2D {
    private int radius;
    
    public Circle(int radius, int vertices, int sides){
         super(vertices, sides);
         this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    
    @Override
    public double perimeter(){
        return 2*Math.PI*this.radius;
    }
    
    
}
