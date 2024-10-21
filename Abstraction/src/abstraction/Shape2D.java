/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author ayden
 */
public abstract class Shape2D{
    
    private int vertices;
    private int sides;
    
    public Shape2D(int vertices, int sides){
          this.vertices = vertices;
          this.sides = sides;
    }
    
    public abstract double area();
    
    public abstract double perimeter();
    
    
}
