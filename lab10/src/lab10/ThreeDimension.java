/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
public class ThreeDimension extends Shape {
    private int edges;
    private int flatSurfaces;
    private int curvedSurfaces;

    /**
     * Constructor for creating a ThreeDimension object.
     *
     * @param vertices       the number of vertices.
     * @param color          the color of the shape.
     * @param edges           the number of edges.
     * @param flatSurfaces    the number of flat surfaces.
     * @param curvedSurfaces  the number of curved surfaces.
     */
    public ThreeDimension(int vertices, String color, int edges, int flatSurfaces, int curvedSurfaces) {
        super(vertices, color);
        this.edges = edges;
        this.flatSurfaces = flatSurfaces;
        this.curvedSurfaces = curvedSurfaces;
    }

    /**
     * Override the get method for shapeID.
     *
     * @return the modified shapeID.
     */
    @Override
    public String getShapeID() {
        return "3D" + super.getShapeID();
    }

    /**
     * Override the toString method.
     *
     * @return String representation of the object.
     */
    @Override
    public String toString() {
        return "Three-dimension class" + this.getShapeID();
    }

    /**
     * Override the display method.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Three-dimensional shape properties:");
        System.out.println("Number of edges: " + edges);
        System.out.println("Number of flat surfaces: " + flatSurfaces);
        System.out.println("Number of curved surfaces: " + curvedSurfaces);
    }

    /**
     * Calculate volume method.
     *
     * @return the volume of the shape.
     */
    public double calculateVolume() {
        return 0; // Return zero for generic 3D shape volume
    }
}