/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classactivity1201;
// * = means your are importing all the files in that folder 
import carPackage.FastCarpackage.SportCar;
import carPackage.*;
import energyPackage.ElectricCar;
/**
 *
 * @author ayden
 */
public class MainDriver{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c = new Car();
        SportCar sc = new SportCar();
        ElectricCar ec = new ElectricCar();
        
        c.display();
        sc.display();
        ec.display();
    }
    
}
