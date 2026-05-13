package Jobsheet12.Queue;
public class QueueNode14 {
    String nim;
    String name;
    String className;
    double gpa;

    QueueNode14 next; // pointer ke node yang ada di belakang dalam antrian

    public QueueNode14(String nim, String name, String className, double gpa) {
        this.nim       = nim;
        this.name      = name;
        this.className = className;
        this.gpa       = gpa;
        this.next      = null;
    }

    public void print() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + name);
        System.out.println("Kelas   : " + className);
        System.out.printf ("IPK     : %.2f%n", gpa);
    }
}
