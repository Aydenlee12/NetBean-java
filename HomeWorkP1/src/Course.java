/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayden
 */
import java.util.ArrayList;

public class Course {
    private String courseID;
    private String name;
    private String credits;

    // Constructor
    public Course(String courseID, String name, String credits) {
        this.courseID = courseID;
        this.name = name;
        this.credits = credits;
    }

    // Getters and Setters
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    // Display course information
    public void displayCourseInfo() {
        System.out.println(courseID + "\t" + name + "\t" + credits);
    }
}