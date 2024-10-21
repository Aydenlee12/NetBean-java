/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author ayden
 */
public class lab09Main {
    public static void main(String[] args){
    // Create modelList and osList arrays
        String[] modelList = {"Apple MacBook", "Asus Zenbook", "Lenovo IdeaPad", "HP Envy", "Dell XPS"};
        String[] osList = {"Mac OS", "MS-Windows", "Ubuntu", "Chrome OS", "MS-Windows"};

        // Create an array of Laptop class called myComputers with 5 elements
        Laptop[] myComputers = new Laptop[5];

        // Initialize each Laptop object in the array using the second constructor
        for (int i = 0; i < myComputers.length; i++) {
            myComputers[i] = new Laptop(modelList[i], osList[i]);
        }

        // Call the two instance methods for each object
        for (Laptop laptop : myComputers) {
            laptop.displayInfo(); // Call displayInfo method
            double discountedPrice = laptop.discount(0.1); // Example discount rate of 10%
            System.out.println("Discounted Price: " + discountedPrice);
        }

    }
    
}
