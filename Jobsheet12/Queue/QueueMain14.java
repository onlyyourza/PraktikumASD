package Jobsheet12.Queue;
import java.util.Scanner;

public class QueueMain14 {
    public static void main(String[] args) {
        LinkedQueue14 queue = new LinkedQueue14();
        Scanner sc = new Scanner(System.in);

        // Isi data awal agar langsung bisa dicoba
        queue.enqueue("2401001", "Andi Pratama",  "TI-1A", 3.75);
        queue.enqueue("2401002", "Bella Safira",  "TI-1A", 3.50);
        queue.enqueue("2401003", "Cahyo Nugroho", "TI-1B", 3.20);

        int pilihan;
        do {
            System.out.println("\n========================================");
            System.out.println("   QUEUE (FIFO) BERBASIS LINKED LIST");
            System.out.println("   Jumlah antrian: " + queue.getSize());
            System.out.println("========================================");
            System.out.println("1. Enqueue  — tambah mahasiswa ke antrian");
            System.out.println("2. Dequeue  — layani mahasiswa terdepan");
            System.out.println("3. Peek     — lihat mahasiswa terdepan");
            System.out.println("4. Tampilkan seluruh antrian");
            System.out.println("5. Cek apakah antrian kosong");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1: { // enqueue
                    System.out.print("NIM    : "); String nim       = sc.nextLine();
                    System.out.print("Nama   : "); String name      = sc.nextLine();
                    System.out.print("Kelas  : "); String className = sc.nextLine();
                    System.out.print("IPK    : "); double gpa       = sc.nextDouble(); sc.nextLine();
                    queue.enqueue(nim, name, className, gpa);
                    break;
                }

                case 2: { // dequeue
                    QueueNode14 keluar = queue.dequeue();
                    if (keluar != null) {
                        System.out.println("Data yang keluar dari antrian:");
                        keluar.print();
                    }
                    break;
                }

                case 3: { // peek
                    QueueNode14 depan = queue.peek();
                    if (depan != null) {
                        System.out.println("Mahasiswa di posisi terdepan antrian:");
                        depan.print();
                    }
                    break;
                }

                case 4: { // print
                    System.out.println("\n--- Isi Antrian Saat Ini ---");
                    queue.print();
                    break;
                }

                case 5: { // isEmpty
                    if (queue.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong (berisi " + queue.getSize() + " mahasiswa).");
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
}
