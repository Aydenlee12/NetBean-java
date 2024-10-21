/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class Square extends TwoDimension{
    /**
     * Length: int
     */
    private int length;
    
    public Square(int vertices, String color, int sides, int length){
       super(vertices, color, sides);
       this.length = length;
    }
        /**
     * @return 
     */
    //@Ovrride
    public String getShapeID() {
        return "Square" + super.getShapeID();
    }
    /**
     * Display 2d properties
     */
    //Override
    public void display() {
        super.display();
     
        System.out.println("Square shape properties:");
        System.out.println("Number of sides: " + this.length);
    }
    /**
     * 
     * @return shape ID
     */
    public String toSting(){
        return "Square " + super.getShapeID();
    }
    /**
     * 
     * @return perimeter
     */
    //@Override
    public double perimeter() {
        return this.length*4;
    }
    /**
     * 
     * @return area
     */
    //@Override
    public double area() {
        return (this.length * this.length);
    }
    
}
