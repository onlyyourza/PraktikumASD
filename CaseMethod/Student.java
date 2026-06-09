package CaseMethod;

public class Student {
    String nim;
    String name;
    String studyProgram;
    int phoneNumber;

    public Student(String nim, String name, String studyProgram, int phoneNumber) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.phoneNumber = phoneNumber;
    }

    public void printStudent() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + studyProgram + " | Phone Number: " + phoneNumber);
    }
}