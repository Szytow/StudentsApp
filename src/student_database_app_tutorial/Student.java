package student_database_app_tutorial;

import java.util.Scanner;


public class Student {
    private final String firstName;
    private final String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private final int courseCost = 600;
    private static int id = 1000;
    
    
    //Constructor; prompt asking for a name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter grade: ");
        this.gradeYear = in.nextInt();
        
        setID();
    }    
    
    //Generate an ID
    private void setID(){
        id++;
        this.studentId = gradeYear + "" + id;
    }
    
    //Enroll in courses
    public void enroll(){
        //Loop for adding courses, Q quits
        System.out.println("Enter course to enroll (Q to quit)");
        do{
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") ){
                this.courses += "\n " + course;
                this.tuitionBalance += this.courseCost;
            }
            else {break; }
        } while (1 != 0);
    }
    
    //View balance
    public void getBalance(){
        System.out.println("Your balance is: " + tuitionBalance + "$");
    }
    
    //Pay tuition
    public void payTuition(){
        getBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thanks for payment of $" + payment);
        getBalance();
    }
    
    //Show status
    public void showInfo(){
        System.out.println("Name" + firstName + " " + lastName);
        System.out.println("Grade level: " + gradeYear);
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses enrolled: " + courses);
        System.out.println("Your balance is: $" + tuitionBalance);
    }
}
