/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 * TwoDimension.java
 * Ayden Lee
 * lab10
 * 
 */
public class TwoDimension extends Shape {
    /**
     * sides: int 
     */
    private int sides;
    /**
     * 
     * @param vertices
     * @param color
     * @param sides 
     */
    public TwoDimension(int vertices, String color, int sides){
       super(vertices, color);
       this.sides = sides;
    }
    /**
     * @return 
     */
    //@Ovrride
    public String getShapeID() {
        return "2D" + super.getShapeID();
    }
    /**
     * Display 2d properties
     */
    //Override
    public void display() {
        super.display();
     
        System.out.println("Two-dimensional shape properties:");
        System.out.println("Number of sides: " + this.sides);
    }
    /**
     * 
     * @return shape ID
     */
    public String toSting(){
        return "Two-dimension class" + super.getShapeID();
    }
    /**
     * 
     * @return perimeter
     */
    public double perimeter() {
        return 0.0;
    }
    /**
     * Calculate 2D area
     * @return area
     */
    public double area() {
        return 0.0;
    }
    
}
