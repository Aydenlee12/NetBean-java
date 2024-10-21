/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayden
 */
import java.util.ArrayList;

class Student {
    private int registrationNo;
    private ArrayList<Course> courseList;
    private static int listAssignedRegistrationNo = 1000;

    // Constructor
    public Student() {
        this.courseList = new ArrayList<>();
        this.registrationNo = listAssignedRegistrationNo += 5;
    }

    // Add Course to courseList
    public void addCourse(String courseID, String name, String credits) {
        Course course = new Course(courseID, name, credits);
        courseList.add(course);
    }

    // Get list of courseIDs
    public ArrayList<String> getCourseIDs() {
        ArrayList<String> courseIDs = new ArrayList<>();
        for (Course course : courseList) {
            courseIDs.add(course.getCourseID());
        }
        return courseIDs;
    }

    // Get total credits
    public int getTotalCredits() {
        int totalCredits = 0;
        for (Course course : courseList) {
            totalCredits += Integer.parseInt(course.getCredits());
        }
        return totalCredits;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Registration number: " + registrationNo);
        System.out.println("List of courses:");
        for (Course course : courseList) {
            course.displayCourseInfo();
        }
    }
}
