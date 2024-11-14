/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Class representing a college student, used for CS/IT 114 
 */

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private static final int MAX_COURSES = 6;
    
    private String name;
    private String major;
    private int credits;
    private int age;
    private double spentSoFar;
    private boolean isSenior;
    private List<Course> courses;
    
    public Student(String name, String major, int credits, int age, double spentSoFar, boolean isSenior) {
        this.name = name;
        this.major = major;
        this.credits = credits;
        this.age = age;
        this.spentSoFar = spentSoFar;
        this.isSenior = isSenior;
        this.courses = new ArrayList<Course>();
    }
    
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSpentSoFar(){
        return spentSoFar;
    }
    
    public boolean isStudentASenior(){
        return isSenior;
    }
    
    // Prints a list of courses that the 
    // student is currently taking
    public void printCourses(){
        if (courses.size() <= 0)
            System.out.println("No courses to list...");
        else
        for (Course c : courses)
            System.out.println(c.getTitle());
    }
    
    public boolean hasSpace() {
        return courses.size() < MAX_COURSES;
    }
    
    public void addCourse(Course c){
        courses.add(c);
    }
    
}
