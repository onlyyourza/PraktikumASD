package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlah];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("SKS  : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());

            arrayOfMatakuliah[i] = new Matakuliah14(kode, nama, sks, jumlahJam);
            System.out.println("----------------------------");
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].printInfo();
        }

        sc.close();
    }
}