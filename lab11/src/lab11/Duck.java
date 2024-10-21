/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 * Create a Duck class which implements to BarnYardAnimal and also have return statements 
 * @author ayden
 */
public class Duck implements BarnYardAnimal{
    @Override
    public String getName(){
        return "Duck";
    }
    @Override
    public String speak(){
        return "Quack";
    }
}
