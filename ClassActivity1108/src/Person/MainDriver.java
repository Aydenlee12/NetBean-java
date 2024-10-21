/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author ayden
 */
public class MainDriver {
    public static void main(String[] args){
            
    Person p = new Person();
    Student s = new Student();
    Instructor i = new Instructor();
    
    
    p.display();
    
    p = s;
    s.display();
     
    p = i;
    s.display();
    }
}