/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;
/**
 *
 * @author ayden
 */
public class Student extends Person {
   
        private double marks1;
        private double marks2;
// Default constructor         
        public Student(){
        }

    public double getMarks1() {
        return marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }
    public void display(){
         System.out.println("This is student: ");
    }
    
    public double calcAverage(){
        return (this.marks1 + this.marks2)/2;
    }
    
    
}