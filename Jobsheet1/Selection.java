import java.util.Scanner;
    public class Selection {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double tugas, kuis, uts, uas, nilaiAkhir;
            String nilaiHuruf = null;
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("==============================");
            System.out.print("Masukkan Nilai Tugas: ");
            tugas = input.nextDouble();
            System.out.print("Masukkan Nilai Kuis: ");
            kuis = input.nextDouble();
            System.out.print("Masukkan Nilai UTS: ");
            uts = input.nextDouble();
            System.out.print("Masukkan Nilai UAS: ");
            uas = input.nextDouble();
            System.out.println("==============================");
            System.out.println("==============================");

            if (tugas > 100 || tugas < 0 || kuis > 100 || kuis < 0 || uts > 100 || uts < 0 || uas > 100 || uas < 0) {
                System.out.println("nilai tidak valid");
                System.out.println("==============================");
                System.out.println("==============================");
                input.close();
                return;
            }

            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <=100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }
            else {
                System.out.println("nilai tidak valid");
            }

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("Nilai Huruf: " + nilaiHuruf);
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("Keterangan: Anda Tidak Lulus");
            } else {
                System.out.println("Nilai Huruf: " + nilaiHuruf);
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("Keterangan: Anda Lulus");
            }
            input.close();
        }
    }