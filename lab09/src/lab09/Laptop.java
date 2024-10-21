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

public class Laptop {
    private String model;
    private double screenSize;
    private int memory;
    private String graphicsCard;
    private boolean isTouchscreen;
    private String os;
    private double price;

    private Random randGen;

    // Default constructor
    public Laptop() {
        randGen = new Random();
    }

    // Constructor with parameters
    public Laptop(String model, String os) {
        this(); // Call the default constructor to initialize random generator and other defaults
        this.model = model;
        this.os = os;
        this.screenSize = getRandomDouble(11.6, 18.2);
        this.memory = getRandomInt(2, 16);
        this.graphicsCard = getRandomGraphicsCard();
        this.isTouchscreen = randGen.nextBoolean();
        this.price = getRandomDouble(250.0, 2500.0);
    }

    // Getters and setters for instance variables

    // Display Laptop information
    public void displayInfo() {
        System.out.println(model + " with " + os + " operating system and " + memory + " RAM.");
        System.out.println("Display: " + screenSize + " screen with " + graphicsCard);
        System.out.println("Touch screen: " + (isTouchscreen ? "Yes" : "No"));
        System.out.println("Regular price: " + price);
    }

    // Apply discount to the price
    public double discount(double rate) {
        return price - (price * rate);
    }

    // Helper method to generate a random double within a range
    private double getRandomDouble(double min, double max) {
        return (randGen.nextDouble() * (max - min)) + min;
    }

    // Helper method to generate a random integer within a range
    private int getRandomInt(int min, int max) {
        return randGen.nextInt(max - min + 1) + min;
    }

    // Helper method to get a random graphics card
    private String getRandomGraphicsCard() {
        String[] graphicsCards = {"Nvidia RTX", "Apple M2 Pro", "Intel Iris Xe", "AMD Radeon"};
        int index = randGen.nextInt(graphicsCards.length);
        return graphicsCards[index];
    }
}