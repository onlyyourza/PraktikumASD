package Jobsheet11.Assigment;

import java.util.Scanner;

public class KRSMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue14 queue = new KRSQueue14(10); // maksimal ukuran queue = 10
        int choice;
        do {
            System.out.println("\n=== KRS Approval Queue (DPA) ===");
            System.out.println("1. Register & add student to queue");
            System.out.println("2. Process KRS approval (2 students)");
            System.out.println("3. Show all students in queue");
            System.out.println("4. Show first two in line");
            System.out.println("5. Show last student in queue");
            System.out.println("6. Show statistics (total/completed/not yet)");
            System.out.println("7. Check if queue is empty");
            System.out.println("8. Check if queue is full");
            System.out.println("9. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class : ");
                    String className = sc.nextLine();
                    queue.enqueue(new Student(nim, name, studyProgram, className));
                    break;
                case 2:
                    queue.approveSession();
                    break;
                case 3:
                    queue.printAll();
                    break;
                case 4:
                    queue.printFirstTwo();
                    break;
                case 5:
                    queue.printLast();
                    break;
                case 6:
                    queue.info();
                    break;
                case 7:
                    System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is NOT empty.");
                    break;
                case 8:
                    System.out.println(queue.isFull() ? "Queue is full." : "Queue is NOT full.");
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thanks!!");
                    break;
                default:
                    System.out.println("Invalid menu!!");
            }
        } while (choice != 0);
        sc.close();
    }
}
