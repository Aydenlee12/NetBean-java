/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 * Shape.java
 * Ayden lee
 * Lab10
 * 
 */
public class Shape {
    /**
     * shape ID: String
     * vertices: int
     * Color: String 
     * lastAssignedShapeID: Static int 
     */
        private String shapeID;
        private int vertices;
        private String color;
        
        private static int lastAssignedShapeID = 0;
        /**
         * 
         * @param vertices
         * @param color 
         */
        public Shape(int vertices, String color) {
        Shape.lastAssignedShapeID++;

        this.shapeID = "Shape" + Shape.lastAssignedShapeID;

        // Set the instance variables vertices and color
        this.vertices = vertices;
        this.color = color;
        }
        
        public String getShapeID() {
        return shapeID;
    }

    /**
     * Display general shape properties 
     */
    public void display() {
        System.out.println("Shape ID: " + shapeID);
        System.out.println("Vertices: " + vertices);
        System.out.println("Color: " + color);
    }
    /**
     * @retrun String
     * 
     */
   //@Override
    public String toString(){
        return "Shape class" + shapeID;
    }
    /**
     * @return 
     */

public double calculateArea() {
        return 0.0;
    }
}
