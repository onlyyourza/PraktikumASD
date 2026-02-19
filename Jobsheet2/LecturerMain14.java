package Jobsheet2;

public class LecturerMain14 {
    public static void main(String[] args) {
        Lecturer14 dsn1 = new Lecturer14();
        dsn1.idLecturer = "DSN001";
        dsn1.name = "Budi Santoso";
        dsn1.activeStatus = true;
        dsn1.yearOfEntry = 2018;
        dsn1.expertiseCompetency = "Database";

        dsn1.showInformation();
        dsn1.setStatusActive(false);
        System.out.println("Masa kerja: " + dsn1.calculateTimeWork(2026) + " tahun");
        dsn1.changeSkill("Data Science");
        dsn1.showInformation();

        System.out.println("--------------------------------");

        Lecturer14 dsn2 = new Lecturer14("DSN002", "Siti Aulia", true, 2020, "Networking");

        dsn2.showInformation();
        dsn2.setStatusActive(true);
        System.out.println("Masa kerja: " + dsn2.calculateTimeWork(2026) + " tahun");
        dsn2.changeSkill("Cyber Security");
        dsn2.showInformation();
    }
}
