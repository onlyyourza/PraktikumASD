package Jobsheet13;

public class Student14 {
    String nim, name, className;
    double gpa;

    public Student14(){
    }
    public Student14(String nm, String nama, String kls, double ip){
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }
    void print(){
        System.out.println(nim+ " - "+name+" - "+className+" - "+gpa);
    }
}
