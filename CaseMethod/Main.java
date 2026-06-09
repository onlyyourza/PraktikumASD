package CaseMethod;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = {
            new Student("22001", "Andi", "Teknik Informatika", 124124),
            new Student("22002", "Budi", "Teknik Informatika", 123912),
            new Student("22003", "Citra", "Sistem Informasi Bisnis", 213123)
        };

        Book[] books = {
            new Book("B001", "Algoritma", 2020, "Mafaza"),
            new Book("B002", "Basis Data", 2019, "Agya"),
            new Book("B003", "Pemrograman", 2021, "AKU"),
            new Book("B004", "Fisika", 2024, "Mafaza")
        };

        BookLending[] loans = {
            new BookLending(students[0], books[0], 7),  
            new BookLending(students[1], books[1], 3),  
            new BookLending(students[2], books[2], 10), 
            new BookLending(students[2], books[3], 6),  
            new BookLending(students[0], books[1], 4)   
        };

        int menuOption;
        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("\nStudent List:");
                    for (Student s : students) s.printStudent(); 
                    break;
                case 2:
                    System.out.println("\nBook List:");
                    for (Book b : books) b.printBook();
                    break;
                case 3:
                    System.out.println("\nLoan Data:");
                    for (BookLending l : loans) l.printLending();
                    break;
                case 4:
                    insertionSortDenda(loans);
                    System.out.println("\nAfter sorting (Largest fine):");
                    for (BookLending l : loans) l.printLending();
                    break;
                case 5:
                    System.out.print("Enter NIM: ");
                    String searchNim = scanner.next();
                    binarySearchNim(loans, searchNim);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menuOption != 0);

        scanner.close();
    }

    public static void insertionSortDenda(BookLending[] data) {
        for (int i = 1; i < data.length; i++) {
            BookLending temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].fine < temp.fine) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static void binarySearchNim(BookLending[] data, String targetNim) {
        for (int i = 1; i < data.length; i++) {
            BookLending temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].sdt.nim.compareTo(temp.sdt.nim) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }

        // nilai tengah
        int kiri = 0, kanan = data.length - 1, indexKetemu = -1;
        
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2; 
            
            if (data[tengah].sdt.nim.equals(targetNim)) {
                indexKetemu = tengah;
                break;
            } else if (data[tengah].sdt.nim.compareTo(targetNim) < 0) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (indexKetemu != -1) {
            System.out.println("\nData ditemukan:");
            int awal = indexKetemu;
            
            while (awal > 0 && data[awal - 1].sdt.nim.equals(targetNim)) {
                awal--;
            }
            while (awal < data.length && data[awal].sdt.nim.equals(targetNim)) {
                data[awal].printLending();
                awal++;
            }
        } else {
            System.out.println("\nData dengan NIM " + targetNim + " tidak ditemukan.");
        }
    }
}