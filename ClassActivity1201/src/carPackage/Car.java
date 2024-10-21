/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carPackage;

/**
 *
 * @author ayden
 */
public class Car {
    public Car(){
        
    }
    // Default access modifier 
    // When you delete the "public" name in a method. It can onlt be accessed in the package 
    // When you change it to "private" that file only 
    // Protected: classes in the same package or subclass from outside the package can only acess 
    public void display(){
        System.out.println("This is a car");
        
    }
}
