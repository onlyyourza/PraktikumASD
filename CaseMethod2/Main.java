package CaseMethod2;
import java.util.Scanner;

public class Main {
    static Scanner   sc     = new Scanner(System.in);
    static QueueList queue  = new QueueList();
    static OrderList orders = new OrderList();

    public static void main(String[] args) {
        queue.addQueue(new Buyer("Ainra", "08224500000"));
        queue.addQueue(new Buyer("Danra", "08224511111"));
        queue.addQueue(new Buyer("Sanri", "08224522222"));

        int choice;
        do {
            printMenu();
            System.out.print("Select menu : ");
            choice = bacaInt();
            switch (choice) {
                case 1: tambahAntrian();   break;
                case 2: queue.printQueue(); break;
                case 3: layaniPembeli();   break;
                case 4: orders.printReport(); break;
                case 0: System.out.println("Terima kasih telah menggunakan Royal Delish Queue System."); break;
                default: System.out.println("Menu tidak valid.");
            }
            System.out.println();
        } while (choice != 0);
    }

    static void tambahAntrian() {
        System.out.print("Buyer Name : ");
        String nama = sc.nextLine().trim();
        System.out.print("No HP      : ");
        String hp = sc.nextLine().trim();
        int no = queue.addQueue(new Buyer(nama, hp));
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + no);
    }

    static void layaniPembeli() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        queue.printQueue();
        System.out.print("Pilih No Antrian yang ingin dilayani : ");
        int noAntrian = bacaInt();

        Buyer dilayani = queue.removeByQueueNumber(noAntrian);
        if (dilayani == null) {
            System.out.println("No antrian tidak ditemukan.");
            return;
        }
        
        System.out.print("Order Code : ");
        int kode = bacaInt();
        if (orders.hasCode(kode)) {
            System.out.println("Kode pesanan sudah dipakai, coba kode lain.");
            return;
        }
        System.out.print("Order Name : ");
        String namaPesanan = sc.nextLine().trim();
        System.out.print("Price      : ");
        int harga = bacaInt();

        orders.addOrder(new Order(kode, namaPesanan, harga));
        System.out.println(dilayani.name + " telah memesan " + namaPesanan);
    }

    static void printMenu() {
        System.out.println("================================");
        System.out.println("ROYAL DELISH QUEUE SYSTEM");
        System.out.println("================================");
        System.out.println("1. Add Queue");
        System.out.println("2. Print Queue");
        System.out.println("3. Remove Queue and Messages");
        System.out.println("4. Order Report");
        System.out.println("0. Exit");
    }

    static int bacaInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Masukkan pilihan yang valid : ");
            }
        }
    }
}
