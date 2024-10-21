/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;
import java.util.ArrayList;

/**
 *
 * @author ayden
 */
public class Barn extends Farm{
/**
 * Create an arraylist that can hold information of animals and there information
 */
   private ArrayList<BarnYardAnimal> animalList;
// Constructor of the class and also the Farm Class
   public Barn(String location, String owner){
       super(location, owner);
       this.animalList = new ArrayList<>();
   }
   public String type(){
       return "barn";
   }
   public void addAnimal(BarnYardAnimal obj){
       animalList.add(obj);
   }
   // Display information of the song 
   public void sing(){
       for(BarnYardAnimal obj: animalList){
       System.out.println(super.getOwner() + "had a " + type() + ". E-I-E-I-O");
       System.out.println("and on that" + type() + "he had a" + obj.getName() + ". E-I-E-I-O");
       System.out.println("With a" + obj.speak() + obj.speak() + " here");
       System.out.println("and a" + obj.speak() + obj.speak() + " there");
       System.out.println("Here a "  + obj.speak());
       System.out.println("There a "  + obj.speak());
       System.out.println("Everywhere a " + obj.speak() + obj.speak());
       System.out.println(super.getOwner() + " had a " + type());
       }
   }
}
