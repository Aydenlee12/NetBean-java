/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author ayden
 */
public class Instructor extends Person {
    private double basicSalary;
    private String officeHour;
    
    public Instructor(){
     
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }
    public void display(){
        super.display();
        System.out.println(" This is an Instructor: ");
    }
    public double calcTotalSalary(){
         return (this.basicSalary + (this.basicSalary * 0.05)) + 100;
    }
}   
