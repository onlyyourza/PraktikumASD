package Pretest;

// ============================================================
// LATIHAN 2.3 - Soal 2
// Gudang mencatat 3 barang (ID 100, 200, 300) dengan enqueue(),
// lalu memanggil print() untuk melihat isi antrian.
// ============================================================
public class Latihan2 {
    public static void main(String[] args) {
        Queue Q = new Queue(5);

        Q.Enqueue(100);
        Q.Enqueue(200);
        Q.Enqueue(300);

        Q.print();
    }
}

