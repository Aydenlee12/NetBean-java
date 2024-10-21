/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class Circle extends TwoDimension{
     /**
     * Length: int
     */
    private int radius;
    
    public Circle(int vertices, String color, int sides, int radius){
       super(vertices, color, sides);
       this.radius = radius;
    }
        /**
     * @return 
     */
    //@Ovrride
    public String getShapeID() {
        return "Circel" + super.getShapeID();
    }
    /**
     * Display 2d properties
     */
    //Override
    public void display() {
        super.display();
     
        System.out.println("Cricle shape properties:");
        System.out.println("Number of sides: " + this.radius);
    }
    /**
     * 
     * @return shape ID
     */
    public String toSting(){
        return "Circle " + super.getShapeID();
    }
    /**
     * 
     * @return perimeter
     */
    //@Override
    public double perimeter(int length) {
        return (this.radius * Math.PI)*2;
    }
    /**
     * 
     * @return area
     */
    //@Override
    public double area() {
        return (this.radius* this.radius)*Math.PI;
    }
    
}
