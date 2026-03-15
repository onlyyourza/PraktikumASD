package Jobsheet3;

public class Dosen14 {
    public String code;
    public String name;
    public boolean gender;
    public int age;

    public Dosen14(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String genderText() {
        return gender ? "Male" : "Female";
    }

    public void printInfo() {
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + genderText());
        System.out.println("Age    : " + age);
    }
}