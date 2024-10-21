/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class Sphere extends ThreeDimension {
    private int radius;

    /**
     * Constructor for creating a Sphere object.
     *
     * @param color  the color of the shape.
     * @param radius the radius of the sphere.
     */
    public Sphere(String color, int radius) {
        super(0, color, 0, 0, 1); // Vertices: 0, Edges: 0, Flat Surfaces: 0, Curved Surfaces: 1
        this.radius = radius;
    }

    /**
     * Override the get method for shapeID.
     *
     * @return the modified shapeID.
     */
    @Override
    public String getShapeID() {
        return "Sphere" + super.getShapeID();
    }

    /**
     * Override the display method.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Sphere shape properties:");
        System.out.println("Radius: " + radius);
    }

    /**
     * Override the toString method.
     *
     * @return String representation of the object.
     */
    @Override
    public String toString() {
        return "Sphere class" + this.getShapeID();
    }

    /**
     * Override the calculate area method to return the surface area of the sphere.
     *
     * @return the surface area of the sphere.
     */
    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    /**
     * Override the calculate volume method to return the volume of the sphere.
     *
     * @return the volume of the sphere.
     */
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
