package Jobsheet2;

public class StudentMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhsl = new Mahasiswa14();
        
        mhsl.nama = "Mafaza";
        mhsl.nim = "254107060130";
        mhsl.kelas = "TI-1A";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();
    }
}
