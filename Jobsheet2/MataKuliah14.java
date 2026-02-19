package Jobsheet2;

public class MataKuliah14 {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public MataKuliah14() {
    }

    public MataKuliah14(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void showInformation() {
        System.out.println("Kode Course      : " + kodeCourse);
        System.out.println("Nama MataKuliah  : " + name);
        System.out.println("SKS              : " + credits);
        System.out.println("Jumlah Jam/Minggu : " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("SKS berhasil diubah menjadi: " + credits);
    }

    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Jam ditambah. Jam sekarang: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours < hours) {
            System.out.println("Pengurangan gagal. Jam tidak cukup untuk dikurangi.");
        } else {
            numberOfHours -= hours;
            System.out.println("Jam dikurangi. Jam sekarang: " + numberOfHours);
        }
    }
}
