/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11;

/**
 *
 * @author ayden
 */
public class Lab11MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application 1logic here
        Barn b1 = new Barn("Park, MN", " Old MacDonald");
        
        BarnYardAnimal Cow = new Cow();
        BarnYardAnimal Duck = new Duck();
        BarnYardAnimal Horse = new Horse();
        
        b1.addAnimal(Cow);
        b1.addAnimal(Duck);
        b1.addAnimal(Horse);
        b1.sing();
    }
    
}
