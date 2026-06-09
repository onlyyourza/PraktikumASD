package Pretest;

import java.util.Scanner;

// ============================================================
// LATIHAN 2.3 - Soal 5
// 3 ID buku (1, 2, 3) dibaca via Scanner dan di-enqueue ke Queue.
// Selama Queue tidak kosong: dequeue() lalu push() ke Stack.
// Tentukan ID buku di posisi paling atas (top) Stack.
// ============================================================
public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue antrian = new Queue(5);
        Stack arsip = new Stack(5);

        // Menerima 3 ID buku
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan ID buku ke-" + i + ": ");
            int id = sc.nextInt();
            antrian.Enqueue(id);
        }

        // Pindahkan semua dari Queue ke Stack
        System.out.println("\nMemindahkan buku dari Queue ke Stack (arsip)...");
        while (!antrian.IsEmpty()) {
            int id = antrian.Dequeue();
            arsip.push(id);
            System.out.println("Dequeue " + id + " -> push ke Stack");
        }

        // ID di posisi paling atas (top) Stack
        System.out.println("\nID buku di posisi paling atas (top) Stack: " + arsip.peek());

        sc.close();
    }
}