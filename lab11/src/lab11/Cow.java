/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 * Create a Cow class which implements to BarnYardAnimal and also have return statements 
 * @author ayden
 */
public class Cow implements BarnYardAnimal {
    @Override
    public String getName(){
        return "Cow";
    }
    @Override
    public String speak(){
        return "Moo";
    }
}
