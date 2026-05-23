package Jobsheet10;

import java.util.Scanner;

public class ExcuseLetterDemo14 {
    public static void main(String[] args) {
        ExcuseLetterStack14 stack = new ExcuseLetterStack14(10);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S = Sick, I = Other): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();
                    ExcuseLetter14 letter = new ExcuseLetter14(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.printf("Excuse letter from %s has been submitted!!\n", letter.name);
                    break;
                case 2:
                    ExcuseLetter14 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing excuse letter from " + processed.name
                                + " (" + describeType(processed.typeOfExcuse)
                                + ", " + processed.duration + " day(s))");
                    }
                    break;
                case 3:
                    ExcuseLetter14 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest excuse letter is from " + latest.name
                                + " (" + describeType(latest.typeOfExcuse)
                                + ", " + latest.duration + " day(s))");
                    }
                    break;
                case 4:
                    System.out.print("Enter the student's name to search: ");
                    String keyword = scan.nextLine();
                    ExcuseLetter14 found = stack.search(keyword);
                    if (found != null) {
                        System.out.println("Letter found! " + found.name + " - "
                                + describeType(found.typeOfExcuse) + ", "
                                + found.duration + " day(s), class " + found.className);
                    } else {
                        System.out.println("No excuse letter found under the name " + keyword);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 4);

        scan.close();
    }

    static String describeType(char type) {
        if (type == 'S' || type == 's') {
            return "Sick";
        } else if (type == 'I' || type == 'i') {
            return "Other personal reason";
        } else {
            return "Unknown";
        }
    }
}
