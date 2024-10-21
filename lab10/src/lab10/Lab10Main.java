/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

/**
 *
 * @author ayden
 */
import java.util.ArrayList;

public class Lab10Main {
    public static void main(String[] args) {
        // Part 1: Create objects and call methods
        Shape genericShape = new Shape(4, "Blue");
        genericShape.display();
        System.out.println(genericShape.toString());
        System.out.println("Area: " + genericShape.calculateArea());

        TwoDimension twoDShape = new TwoDimension(3, "Red", 4);
        twoDShape.display();
        System.out.println(twoDShape.toString());
        System.out.println("Perimeter: " + twoDShape.perimeter());

        ThreeDimension threeDShape = new ThreeDimension(5, "Green", 6, 5, 1);
        threeDShape.display();
        System.out.println(threeDShape.toString());
        System.out.println("Volume: " + threeDShape.calculateVolume());

        Square square = new Square(4, "Yellow", 4, 10);
        square.display();
        System.out.println(square.toString());
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.perimeter());

        // Continue creating objects for Circle, Cube, Sphere, Cylinder as in Part 1...

        // Part 2: Create an ArrayList of Shape class
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(genericShape);
        shapeList.add(twoDShape);
        shapeList.add(threeDShape);
        shapeList.add(square);
        // Add more objects for Circle, Cube, Sphere, Cylinder...

        // Display, toString, and calculate area for each element in shapeList
        for (Shape shape : shapeList) {
            shape.display();
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.calculateArea());
        }

        // Part 3: Create an ArrayList of TwoDimension class
        ArrayList<TwoDimension> twoDList = new ArrayList<>();
        twoDList.add(twoDShape);
        twoDList.add(square);
        // Add more TwoDimension objects...

        // Display, toString, calculate area, and calculate perimeter for each element in twoDList
        for (TwoDimension twoD : twoDList) {
            twoD.display();
            System.out.println(twoD.toString());
            System.out.println("Area: " + twoD.calculateArea());
            System.out.println("Perimeter: " + twoD.perimeter());
        }

        // Part 4: Create an ArrayList of ThreeDimension class
        ArrayList<ThreeDimension> threeDList = new ArrayList<>();
        threeDList.add(threeDShape);
        // Add more ThreeDimension objects...

        // Display, toString, calculate area, and calculate volume for each element in threeDList
        for (ThreeDimension threeD : threeDList) {
            threeD.display();
            System.out.println(threeD.toString());
            System.out.println("Area: " + threeD.calculateArea());
            System.out.println("Volume: " + threeD.calculateVolume());
        }
    }
}
