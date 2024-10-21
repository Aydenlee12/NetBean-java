/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author ayden
 */
public class Square extends Shape2D {
    private int length;
    
    public Square(int length, int vertices, int sides){
         super(vertices, sides);
         this.length = length;
    }
    
    @Override
    public double area(){
        return this.length*this.length;
    }
    
    @Override
    public double perimeter(){
        return 4*this.length;
    }
    
}
