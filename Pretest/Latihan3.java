package Pretest;

import java.util.Scanner;

// ============================================================
// LATIHAN 2.3 - Soal 3
// Kapasitas dibaca via Scanner (input = 2).
// Cek IsFull() -> enqueue(101) -> peek().
// ============================================================
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);

        // Cek apakah antrian penuh (sebelum ada data)
        System.out.println("Apakah antrian penuh? " + Q.IsFull());

        // Masukkan data 101
        Q.Enqueue(101);

        // Cek elemen terdepan
        Q.peek();

        sc.close();
    }
}
