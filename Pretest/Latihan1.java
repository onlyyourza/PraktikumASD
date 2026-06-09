package Pretest;
// ============================================================
// LATIHAN 2.3 - Soal 1
// Sistem antrian menerima 2 data (15 dan 30) dengan enqueue(),
// lalu menampilkan seluruh isi antrian dari depan ke belakang.
// ============================================================
public class Latihan1 {
    public static void main(String[] args) {
        Queue Q = new Queue(5);

        Q.Enqueue(15);
        Q.Enqueue(30);

        System.out.println("Isi antrian dari depan ke belakang:");
        Q.print();
    }
}