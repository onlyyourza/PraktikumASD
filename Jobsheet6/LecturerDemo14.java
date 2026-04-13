package Jobsheet6;

import java.util.Scanner;
public class LecturerDemo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData14 data = new LecturerData14();
        int menuChoice;

        do {
            System.out.println("\n==================================");
            System.out.println("     LECTURER DATA MANAGEMENT     ");
            System.out.println("==================================");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest)");
            System.out.println("4. Sort DSC (Oldest to Youngest)");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("\n--- Add New Lecturer ---");
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Gender (true for Male, false for Female): ");
                    boolean gender = scanner.nextBoolean();
                    
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Lecturer14 newLecturer = new Lecturer14(id, name, gender, age);
                    data.add(newLecturer);
                    break;

                case 2:
                    System.out.println("\n--- All Lecturer Data ---");
                    data.print();
                    break;

                case 3:
                    System.out.println("\n--- Data Sorted ASC (Youngest to Oldest) ---");
                    data.sortingASC();
                    data.print();
                    break;

                case 4:
                    System.out.println("\n--- Data Sorted DSC (Oldest to Youngest) ---");
                    data.sortingDSC();
                    data.print();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (menuChoice != 5);

        scanner.close();
    }
}
