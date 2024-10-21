/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author ayden
 */
import java.util.Random;

public class Dog {
    // Private instance variables
    private String name;
    private int age;
    private double height;
    private double weight;
    private String color;
    private int mood;
    private int hungry;
    private int energy;
    private boolean catChaser;
    private double barkVolume;
    private double growlVolume;
    private int speed;
    private int craftiness;

    // Random generator
    private Random randGen;

    // Default constructor
    public Dog() {
        randGen = new Random();
        // Initialize other instance variables to default or specific values if needed
    }

    // Constructor with parameters
    public Dog(String name, String color) {
        this(); // Call the default constructor to initialize random generator and other defaults
        this.name = name;
        this.color = color;
        this.age = getRandomInt(0, 29);
        this.height = getRandomDouble(4.0, 40.0);
        this.weight = getRandomDouble(1.0, 343.0);
        this.mood = getRandomInt(1, 10);
        this.hungry = getRandomInt(1, 10);
        this.energy = getRandomInt(1, 10);
        this.catChaser = randGen.nextBoolean();
        this.barkVolume = getRandomDouble(0.0, 113.1);
        this.growlVolume = barkVolume / 2; // Assume growl volume is half of bark volume
        this.speed = getRandomInt(1, 10);
        this.craftiness = getRandomInt(1, 10);
    }

    // Getters and setters for instance variables

    // Display Dog information
    public void displayInfo() {
        System.out.println("Dog information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        // Display other instance variables
    }

    // Woof method
    public void woof() {
        System.out.println("Woof!");
    }

    // Play method
    public void play() {
        mood += 2;
        energy -= 1;
        woof();
    }

    // Sleep method
    public void sleep() {
        energy += 2;
        hungry += 2;
    }

    // Feed method
    public void feed() {
        mood += 2;
        hungry -= 3;
        woof();
    }

    // Helper method to generate a random double within a range
    private double getRandomDouble(double min, double max) {
        return (randGen.nextDouble() * (max - min)) + min;
    }

    // Helper method to generate a random integer within a range
    private int getRandomInt(int min, int max) {
        return randGen.nextInt(max - min + 1) + min;
    }
}
