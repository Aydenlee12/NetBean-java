/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceeample;

/**
 *
 * @author ayden
 */
public class Circle implements Shape{
    
        private double radius; 
        
        public Circle(double radius){
            this.radius = radius;
        }
        @Override 
        public double area(){
            return PI*this.radius*this.radius;
        }
        
        @Override
        public double volume(){
            return 0;
        }
}
