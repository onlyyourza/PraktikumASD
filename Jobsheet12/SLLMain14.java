package Jobsheet12;

import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 list = new SingleLinkedList14();
        Scanner sc = new Scanner(System.in);

        list.addLast(new Student14("2401001", "Andi Pratama",   "TI-1A", 3.75));
        list.addLast(new Student14("2401002", "Bella Safira",   "TI-1A", 3.50));
        list.addLast(new Student14("2401003", "Cahyo Nugroho",  "TI-1B", 3.20));

        int pilihan;
        do {
            System.out.println("\n========================================");
            System.out.println("   SINGLE LINKED LIST — MENU UTAMA");
            System.out.println("   Jumlah data saat ini: " + list.size);
            System.out.println("========================================");
            System.out.println(" 1. Tambah di awal        (addFirst)");
            System.out.println(" 2. Tambah di akhir       (addLast)");
            System.out.println(" 3. Sisipkan setelah NIM  (insertAfter)");
            System.out.println(" 4. Sisipkan di indeks    (insertAt)");
            System.out.println(" 5. Tampilkan semua data  (print)");
            System.out.println(" 6. Ambil data di indeks  (getData)");
            System.out.println(" 7. Cari indeks NIM       (indexOf)");
            System.out.println(" 8. Hapus data pertama    (removeFirst)");
            System.out.println(" 9. Hapus data terakhir   (removeLast)");
            System.out.println("10. Hapus berdasarkan NIM (remove)");
            System.out.println("11. Hapus berdasarkan indeks (removeAt)");
            System.out.println(" 0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1: { // addFirst
                    Student14 s = inputMahasiswa(sc);
                    list.addFirst(s);
                    System.out.println("Data berhasil ditambahkan di awal list.");
                    break;
                }

                case 2: { // addLast
                    Student14 s = inputMahasiswa(sc);
                    list.addLast(s);
                    System.out.println("Data berhasil ditambahkan di akhir list.");
                    break;
                }

                case 3: { // insertAfter
                    System.out.print("Masukkan NIM target (sisipkan setelah ini): ");
                    String targetNim = sc.nextLine();
                    Student14 s = inputMahasiswa(sc);
                    list.insertAfter(targetNim, s);
                    break;
                }

                case 4: { // insertAt
                    System.out.print("Masukkan indeks tujuan (0–" + list.size + "): ");
                    int idx = sc.nextInt(); sc.nextLine();
                    Student14 s = inputMahasiswa(sc);
                    list.insertAt(idx, s);
                    System.out.println("Data berhasil disisipkan di indeks " + idx + ".");
                    break;
                }

                case 5: { // print
                    System.out.println("\n--- Isi Single Linked List ---");
                    list.print();
                    break;
                }

                case 6: { // getData
                    System.out.print("Masukkan indeks: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    Student14 result = list.getData(idx);
                    if (result != null) {
                        System.out.println("\nData pada indeks " + idx + ":");
                        result.print();
                    }
                    break;
                }

                case 7: { // indexOf
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNim = sc.nextLine();
                    int pos = list.indexOf(cariNim);
                    if (pos != -1) {
                        System.out.println("NIM " + cariNim + " ditemukan pada indeks " + pos + ".");
                    } else {
                        System.out.println("NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;
                }

                case 8: { // removeFirst
                    Student14 removed = list.removeFirst();
                    if (removed != null) {
                        System.out.println("Data pertama berhasil dihapus:");
                        removed.print();
                    }
                    break;
                }

                case 9: { // removeLast
                    Student14 removed = list.removeLast();
                    if (removed != null) {
                        System.out.println("Data terakhir berhasil dihapus:");
                        removed.print();
                    }
                    break;
                }

                case 10: { // remove by NIM
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String delNim = sc.nextLine();
                    boolean ok = list.remove(delNim);
                    if (ok) System.out.println("NIM " + delNim + " berhasil dihapus.");
                    break;
                }

                case 11: { // removeAt
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    Student14 removed = list.removeAt(idx);
                    if (removed != null) {
                        System.out.println("Data pada indeks " + idx + " berhasil dihapus:");
                        removed.print();
                    }
                    break;
                }

                case 0:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }

    private static Student14 inputMahasiswa(Scanner sc) {
        System.out.print("NIM    : "); String nim       = sc.nextLine();
        System.out.print("Nama   : "); String name      = sc.nextLine();
        System.out.print("Kelas  : "); String className = sc.nextLine();
        System.out.print("IPK    : "); double gpa       = sc.nextDouble(); sc.nextLine();
        return new Student14(nim, name, className, gpa);
    }
}
