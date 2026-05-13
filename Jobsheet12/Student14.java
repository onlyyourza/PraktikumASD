package Jobsheet12;

public class Student14 {
    String nim;
    String name;
    String className;
    double gpa;

    public Student14(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + name);
        System.out.println("Kelas   : " + className);
        System.out.printf ("IPK     : %.2f%n", gpa);
    }
}
