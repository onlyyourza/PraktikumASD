package Jobsheet11.Assigment;

public class KRSQueue14 {
    Student[] data;
    int front, rear, size, max;
    int served;                 // jumlah mahasiswa yang KRS-nya sudah disetujui
    final int dpaCapacity = 30; // setiap DPA menangani maksimal 30 mahasiswa

    public KRSQueue14(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        served = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue has been cleared!");
    }

    void enqueue(Student dt) {
        if (isFull()) {
            System.out.println("Queue is full!!! (max " + max + " students)");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.println(dt.name + " joined the KRS approval queue.");
    }

    // Satu sesi persetujuan KRS = memproses 2 mahasiswa dari depan
    void approveSession() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!! No student to approve.");
            return;
        }
        System.out.println("=== KRS Approval Session (up to 2 students) ===");
        int count = Math.min(2, size);
        for (int k = 0; k < count; k++) {
            Student dt = data[front];
            front = (front + 1) % max;
            size--;
            served++;
            System.out.print("Approved: ");
            dt.print();
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("All students in queue:");
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    void printFirstTwo() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("First two students in line:");
        int count = Math.min(2, size);
        int i = front;
        for (int k = 0; k < count; k++) {
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void printLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("Last student in queue:");
        data[rear].print();
    }

    void info() {
        System.out.println("Students currently in queue : " + size);
        System.out.println("Students approved (completed): " + served);
        System.out.println("Students not yet completed   : " + (dpaCapacity - served));
    }
}