/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class Cylinder extends ThreeDimension {
    private int radius;
    private int height;

    /**
     * Constructor for creating a Cylinder object.
     *
     * @param color  the color of the shape.
     * @param radius the radius of the cylinder.
     * @param height the height of the cylinder.
     */
    public Cylinder(String color, int radius, int height) {
        super(0, color, 0, 0, 1); // Vertices: 0, Edges: 0, Flat Surfaces: 0, Curved Surfaces: 1
        this.radius = radius;
        this.height = height;
    }

    /**
     * Override the get method for shapeID.
     *
     * @return the modified shapeID.
     */
    @Override
    public String getShapeID() {
        return "Cylinder" + super.getShapeID();
    }

    /**
     * Override the display method.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Cylinder shape properties:");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }

    /**
     * Override the toString method.
     *
     * @return String representation of the object.
     */
    @Override
    public String toString() {
        return "Cylinder class" + this.getShapeID();
    }

    /**
     * Override the calculate area method to return the surface area of the cylinder.
     *
     * @return the surface area of the cylinder.
     */
    @Override
    public double calculateArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    /**
     * Override the calculate volume method to return the volume of the cylinder.
     *
     * @return the volume of the cylinder.
     */
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}