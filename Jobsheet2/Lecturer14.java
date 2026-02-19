package Jobsheet2;

public class Lecturer14 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturer14() {
    }

    public Lecturer14(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void showInformation() {
        System.out.println("ID Dosen     : " + idLecturer);
        System.out.println("Nama         : " + name);
        System.out.println("Status Aktif : " + (activeStatus ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Masuk  : " + yearOfEntry);
        System.out.println("Keahlian     : " + expertiseCompetency);
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
        System.out.println("Status dosen diubah menjadi: " + (activeStatus ? "Aktif" : "Tidak Aktif"));
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Keahlian dosen diubah menjadi: " + expertiseCompetency);
    }
}
