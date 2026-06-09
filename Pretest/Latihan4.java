package Pretest;
// ============================================================
// LATIHAN 2.3 - Soal 4
// Tanpa Scanner. 3 pasien (101, 102, 103) didaftarkan dengan
// enqueue(), lalu dipanggil semua dengan dequeue().
// Setiap dequeue: jika antrian menjadi kosong, front & rear
// di-reset menjadi -1. Tampilkan nilai front & rear di akhir.
// ============================================================
public class Latihan4 {
    public static void main(String[] args) {
        Queue Q = new Queue(5);

        Q.Enqueue(101);
        Q.Enqueue(102);
        Q.Enqueue(103);
        System.out.println("Setelah 3 enqueue -> front = " + Q.front + ", rear = " + Q.rear);

        for (int k = 1; k <= 3; k++) {
            int keluar = Q.Dequeue();
            System.out.println("Dequeue ke-" + k + " (data " + keluar + ") -> front = "
                    + Q.front + ", rear = " + Q.rear);
        }

        System.out.println("\nNilai akhir: front = " + Q.front + ", rear = " + Q.rear);
    }
}