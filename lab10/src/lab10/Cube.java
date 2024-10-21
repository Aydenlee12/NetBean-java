/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class Cube extends ThreeDimension {
    private int length;

    /**
     * Constructor for creating a Cube object.
     *
     * @param color  the color of the shape.
     * @param length the edge length of the cube.
     */
    public Cube(String color, int length) {
        super(8, color, 12, 6, 0); // Vertices: 8, Edges: 12, Flat Surfaces: 6, Curved Surfaces: 0
        this.length = length;
    }

    /**
     * Override the get method for shapeID.
     *
     * @return the modified shapeID.
     */
    @Override
    public String getShapeID() {
        return "Cube" + super.getShapeID();
    }

    /**
     * Override the display method.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Cube shape properties:");
        System.out.println("Edge length: " + length);
    }

    /**
     * Override the toString method.
     *
     * @return String representation of the object.
     */
    @Override
    public String toString() {
        return "Cube class" + this.getShapeID();
    }

    /**
     * Override the calculate area method to return the surface area of the cube.
     *
     * @return the surface area of the cube.
     */
    @Override
    public double calculateArea() {
        return 6 * length * length;
    }

    /**
     * Override the calculate volume method to return the volume of the cube.
     *
     * @return the volume of the cube.
     */
    @Override
    public double calculateVolume() {
        return length * length * length;
    }
}