/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Container for static methods, used for CS/IT 114 
 */

import java.util.Scanner;

public class MethodHolder {
    
    // How much each credit costs
    private static final double COST_PER_CREDIT = 345.59;
    
    // The minimum number of credits necessary to qualify
    // as a senior
    private static final int SENIOR_MIN_CREDITS = 90;
    
    // A course qualifies as "intense" if it counts 
    // for this many credits or more
    private static final int INTENSITY_THRESHOLD = 4;
    
    protected static Student generateStudent(){
        
        Scanner scan = new Scanner(System.in);
        String name = null;
        String major = null;
        int credits = 0;
        int age = 0;
        
        // YOUR CODE GOES HERE
        
        // Prompts user for their name, accepts the input and prints out the prompt and input in one line
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("Name: " + name);
        
        // Prompts user for their major, accepts the input and prints out the prompt and input in one line
        System.out.println("Major:");
        major = scan.nextLine();
        System.out.println("Major: " + major);
        
        // Prompts user for the number of credits they have, accepts the input prints out the prompt and input in
        // one line
        System.out.println("Credits:");
        credits = scan.nextInt();
        System.out.println("Credits: " + credits);
        
        // Prompts user for their age, accepts the input and prints out the prompt and input in one line
        System.out.println("Age:");
        age = scan.nextInt();
        System.out.println("Age: " + age);
        
        // replace 0.0 and false with appropriate double and boolean expressions, respectively
        // returns the students name, major, age, creduts, tuition cost, and if they are a senior
        return new Student(name, major, credits, age, credits * COST_PER_CREDIT, credits >= SENIOR_MIN_CREDITS); 
    }
    
    protected static Course generateCourse(){
        
        Scanner scan = new Scanner(System.in);
        String title = null;
        String department = null;
        int credits = 0; 
        int maxStudents = 0;
        
        // YOUR CODE GOES HERE
        
        //// Prompts user for the course title, accepts the input and prints out the prompt and input in one line
        System.out.println("Title:");
        title = scan.nextLine();
        System.out.println("Title: " + title);
        
        // Prompts user for the department name, accepts the input and prints out the prompt and input in one line 
        System.out.println("Department:");
        department = scan.nextLine();
        System.out.println("Department: " + department);
        
        // Prompts user for the courses credits, accepts the input and prints out the prompt and input in one line
        System.out.println("Credits:");
        credits = scan.nextInt();
        System.out.println("Credits: " + credits);
        
        // Prompts user for the course max students, accepts the input and prints out the prompt and input in one line
        System.out.println("Maximum Students:");
        maxStudents =  scan.nextInt();
        System.out.println("Maximum Students: " + maxStudents);
        
        
        // replace 0.0 and false with appropriate double and boolean expressions, respectively
        // returns the course's title, department, maxStudents, cost, and if it is considered intensive
        return new Course(title, department, credits, maxStudents, credits * COST_PER_CREDIT, 
                          credits >= INTENSITY_THRESHOLD);
        
    }
    
    protected static void printStudentInfo(Student s){
        
        // YOUR CODE GOES HERE
        // prints out the student's name, major, credits, age, 
        //money spent, if they are a senior and courses
        //enrolled in
        System.out.println("Name: " + s.getName());
        System.out.println("Major: " + s.getMajor());
        System.out.println("Credits: " + s.getCredits());
        System.out.println("Age: " + s.getAge());
        System.out.println("Spent So Far: " + s.getSpentSoFar());
        System.out.println("Student is senior? " + s.isStudentASenior());
        System.out.println("Courses: ");
        s.printCourses();                             
                         
    }
    
    protected static void printCourseInfo(Course c){
        
        //YOUR CODE GOES HERE
        // prints out the course's title, department, credits, 
        //enrollment number, cost, whether or not it is considered
        // intensive, and how many students are currently enrolled 
        System.out.println("Title: " + c.getTitle());
        System.out.println("Department: " + c.getDepartment());
        System.out.println("Credits: " + c.getCredits());
        System.out.println("Enrollment: " + c.getEnrollment());
        System.out.println("Cost: " + c.getCost());
        System.out.println("Course is intensive? " + c.isCourseIntensive());
        System.out.println("Students enrolled: ");
        c.printStudents();
        
    }
    
    // Enrolls a student in a course, if the student's schedule and 
    // the course both have space
    protected static void enrollStudentInCourse(Student s, Course c){
        
        if (s.hasSpace() && c.hasSpace()) {
            s.addCourse(c);
            c.addStudent(s);
            System.out.println(s.getName() + " added to " + c.getTitle());
        }
        else {
            if (!s.hasSpace())
                System.out.println(s.getName() + "'s schedule is full");
            if(!c.hasSpace())
                System.out.println(c.getTitle() + " is full");
        }
        
    }
    
}
