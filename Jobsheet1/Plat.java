import java.util.Scanner;
public class Plat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] CODE = {'A','B','D','E','F','G','H','L','N','T'};
        String[] namaKota = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        String[][] kota = new String[10][12];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < namaKota[i].length(); j++) {
                kota[i][j] = String.valueOf(namaKota[i].charAt(j));
            }
        }

        System.out.print("Masukkan kode plat: ");
        char kodeInput = input.next().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == kodeInput) {
                ditemukan = true;
                System.out.println("Kota: " + namaKota[i]);

                for (int j = 0; j < 12; j++) {
                    kota[i][j] = "";
                }
                System.out.println("Nama kota telah dihapus.");
            }
        }
        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan.");
        }
        input.close();
    }
}
