import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 1, 2};

        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];

        double total = 0;
        int totalSKS = 0;

        System.out.println("==============================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================================================");

        for (int i = 0; i < 8; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("nilai tidak valid");
                input.close();
                return;
            }

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            total += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = total / totalSKS;

        System.out.println("==============================================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================================================");

        System.out.printf("%-45s %-15s %-15s %-15s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < 8; i++) {
            System.out.printf("%-45s %-15.2f %-15s %-15.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("==============================================================");
        System.out.printf("IP : %.2f", ip);
        input.close();
    }
}