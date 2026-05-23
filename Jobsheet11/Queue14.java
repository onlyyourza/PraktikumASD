package Jobsheet11;

public class Queue14 {
    int[] data;
    int front, rear, size, max;

    // Constructor: menyiapkan array & kondisi awal queue kosong
    public Queue14(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    // Cek apakah queue kosong
    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Cek apakah queue penuh
    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // Menampilkan elemen paling depan
    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: " + data[front]);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    // Menampilkan seluruh elemen dari front ke rear
    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Number of element: " + size);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    // Mengosongkan queue
    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!!!");
        }
    }

    // Menambah elemen ke belakang queue (circular)
    void enqueue(int dt) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            System.out.printf("%d is successfully added at index %d\n", dt, rear);
        } else {
            System.out.println("Queue is full!!!");
        }
    }

    // Mengambil & menghapus elemen dari depan queue (circular)
    int dequeue() {
        int dt = 0;
        if (!isEmpty()) {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue is empty!!!");
        }
        return dt;
    }
}
