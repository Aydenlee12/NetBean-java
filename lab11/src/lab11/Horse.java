/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 * Create a Horse class which implements to BarnYardAnimal and also have return statements 
 * @author ayden
 */
public class Horse implements BarnYardAnimal{
    @Override
    /**
     * 
     */
    public String getName(){
        return "Hores";
    }
    @Override
    public String speak(){
        return "Neigh";
    }
}
