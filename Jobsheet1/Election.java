import java.util.Scanner;
    public class Election {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.print("Masukkan Nilai Tugas: ");
            input.nextInt();
            System.out.println("Masukkan Nilai Kuis: ");
            input.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            input.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            input.nextInt();
            input.close();
        }
    }