package Jobsheet2;

public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeCourse = "IF101";
        mk1.name = "Pemrograman Dasar";
        mk1.credits = 3;
        mk1.numberOfHours = 4;

        mk1.showInformation();
        mk1.updateSKS(4);
        mk1.addHour(2);
        mk1.reduceHours(3);
        mk1.showInformation();

        System.out.println("--------------------------------");

        MataKuliah14 mk2 = new MataKuliah14("IF202", "Struktur Data", 3, 5);

        mk2.showInformation();
        mk2.updateSKS(2);
        mk2.addHour(1);
        mk2.reduceHours(10);
        mk2.showInformation();
    }
}
