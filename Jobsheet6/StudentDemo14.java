package Jobsheet6;
import java.util.Scanner;

public class StudentDemo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        TopStudent14 topStudents = new TopStudent14(numberOfStudents);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n--- Enter data for Student " + (i + 1) + " ---");
            
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Class: ");
            String studentClass = scanner.nextLine();
            
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            Student14 newStudent = new Student14(nim, name, studentClass, gpa);
            topStudents.add(newStudent);
        }

        System.out.println("\n=================================");
        System.out.println("Original student list:");
        topStudents.print();


        topStudents.bubbleSort();
        
        System.out.println("\n=================================");
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();
        scanner.close();
    }
}
