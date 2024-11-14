/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Class representing a college course, used for CS/IT 114 
 */

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    private String title;
    private String department;
    private int credits;
    private final int maxStudents;
    private double cost;
    private boolean isIntensive;
    private List<Student> students;
    
    public Course(String title, String department, int credits,
                                int maxStudents, double cost, boolean isIntensive) {
        
        this.title = title;
        this.department = department;
        this.credits = credits;
        this.maxStudents = maxStudents;
        this.cost = cost;
        this.isIntensive = isIntensive;
        this.students = new ArrayList<Student>();
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public int getMaxStudents() {
        return maxStudents;
    }
    
    public double getCost() {
        return cost;
    }
    
    public boolean isCourseIntensive(){
        return isIntensive;
    }
    
    public int getEnrollment(){
        return students.size();
    }
    
    // Prints a list of students currently enrolled 
    // in the course
    public void printStudents(){
        
        if (students.size() <= 0)
            System.out.println("No students to list...");
        else
        for (Student s : students)
            System.out.println(s.getName());
        
    }
    
    public boolean hasSpace() {
        return students.size() < maxStudents;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }
    
    
}
