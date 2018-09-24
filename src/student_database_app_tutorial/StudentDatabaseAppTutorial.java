package student_database_app_tutorial;

import java.util.Scanner;

public class StudentDatabaseAppTutorial {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.enroll();
        st1.payTuition();
        int id = 0;
        //Ask how many students 
        System.out.print("Enter number of new students: ");
        Scanner in = new Scanner(System.in);
        int studentsNumber = in.nextInt();
        Student[] students = new Student[studentsNumber];
        
        //Create these students 
        for (int i = 0; i < studentsNumber; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            students[i].showInfo();
        }
        
        
    }
    
}
