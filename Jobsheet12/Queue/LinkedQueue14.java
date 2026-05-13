package Jobsheet12.Queue;

public class LinkedQueue14 {

    private QueueNode14 front;
    private QueueNode14 rear;
    private int size;

    public LinkedQueue14() {
        front = null;
        rear  = null;
        size  = 0;
    }

    // isEmpty — kembalikan true jika antrian kosong
    public boolean isEmpty() {
        return front == null;
    }

    // getSize — jumlah elemen dalam antrian
    public int getSize() {
        return size;
    }

    // enqueue — tambah elemen baru di bagian belakang antrian
    public void enqueue(String nim, String name, String className, double gpa) {
        QueueNode14 newNode = new QueueNode14(nim, name, className, gpa);
        if (isEmpty()) {
            // antrian masih kosong, node baru sekaligus jadi front dan rear
            front = newNode;
            rear  = newNode;
        } else {
            // sambungkan node baru ke belakang, lalu geser rear
            rear.next = newNode;
            rear      = newNode;
        }
        size++;
        System.out.println("[Enqueue] " + name + " berhasil masuk antrian.");
    }

    // dequeue — ambil dan hapus elemen paling depan antrian, Kembalikan node yang dihapus, atau null jika kosong
    public QueueNode14 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa di-dequeue.");
            return null;
        }
        QueueNode14 removed = front;
        front = front.next; // geser front ke node berikutnya

        // jika setelah dihapus antrian jadi kosong, rear juga harus null
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("[Dequeue] " + removed.name + " keluar dari antrian.");
        return removed;
    }

    // peek — lihat elemen paling depan tanpa menghapusnya
    public QueueNode14 peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return front;
    }

    // print — tampilkan seluruh isi antrian dari depan ke belakang
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Posisi  : DEPAN → BELAKANG");
        QueueNode14 current = front;
        int urutan = 1;
        while (current != null) {
            System.out.println("[" + urutan + "]");
            current.print();
            System.out.println("----------------------------");
            current = current.next;
            urutan++;
        }
    }
}
