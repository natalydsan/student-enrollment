/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Program's driver class, used for CS/IT 114 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverClass {
    
    public static void main(String[] args) {
        
        int option = 0;
        String sentinel = "";
        Scanner scan = new Scanner(System.in);
        List<Course> courses = new ArrayList<Course>();
        List<Student> students = new ArrayList<Student>();
        
        
        System.out.println("Welcome to the program, let's begin!\n");
        
        do {
            
            System.out.println("Here are your options: ");
            System.out.println("1 = Add a new student");
            System.out.println("2 = Add a new course");
            System.out.println("3 = Enroll a student in a course");
            System.out.println("4 = Print student info");
            System.out.println("5 = Print course info");
            System.out.println();
            
            do {
                
                System.out.println("Please enter an integer, 1-5:");
                try {
                    option = scan.nextInt();
                } catch (Exception e) {
                    ;
                }
                scan.nextLine();
                
            } while (!(1 <= option && option <= 5));
            
            int studentIndex, courseIndex;
            
            switch(option){
                
                case 1:
                    students.add(MethodHolder.generateStudent());
                    break;
                    
                case 2: 
                    courses.add(MethodHolder.generateCourse());
                    break;
                    
                case 3:        
                    System.out.println("Students: ");
                    for (int i = 0; i < students.size(); i++)
                        System.out.println(students.get(i).getName() + ": #" + i);
                    System.out.println();
                    System.out.println("Enter student ID#:");
                    studentIndex = scan.nextInt(); scan.nextLine();
                    System.out.println();
                    
                    System.out.println("Courses: ");
                    for (int i = 0; i < courses.size(); i++)
                        System.out.println(courses.get(i).getTitle() + ": #" + i);
                    System.out.println();
                    System.out.println("Enter course ID#:");
                    courseIndex = scan.nextInt(); scan.nextLine();
                    System.out.println();
                    
                    MethodHolder.enrollStudentInCourse(students.get(studentIndex), courses.get(courseIndex));
                    break;
                    
                case 4:     
                    System.out.println("Students: ");
                    for (int i = 0; i < students.size(); i++)
                        System.out.println(students.get(i).getName() + ": #" + i);
                    System.out.println();
                    System.out.println("Enter student ID#:");
                    studentIndex = scan.nextInt(); scan.nextLine();
                    System.out.println();
                    
                    MethodHolder.printStudentInfo(students.get(studentIndex));
                    break;
                    
                case 5:
                    System.out.println("Courses: ");
                    for (int i = 0; i < courses.size(); i++)
                        System.out.println(courses.get(i).getTitle() + ": #" + i);
                    System.out.println();
                    System.out.println("Enter course ID#:");
                    courseIndex = scan.nextInt(); scan.nextLine();
                    System.out.println();
                    
                    MethodHolder.printCourseInfo(courses.get(courseIndex));
                    break;
                    
            }
            
            System.out.println();
            System.out.println("Press ENTER to continue or input 1 to quit:");
            sentinel = scan.nextLine();
            System.out.println();
            
        } while (!sentinel.equals("1"));
        
        System.out.println("\nProgram complete");
        
    }
    
}
