/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ayden
 */
public class MainDriver {
    public static void main(String[] args) {
        Student[] myClass = new Student[3];
        
        for(int i = 0; i<myClass.length;++i){
           myClass[i] = new Student();
        }

        myClass[0].addCourse("CSC170", "Java", "4");
        myClass[1].addCourse("Art123", "Painting", "4");
        myClass[2].addCourse("Math 145", "Calc", "4");
    }
}
