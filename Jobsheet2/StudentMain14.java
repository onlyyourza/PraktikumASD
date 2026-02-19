package Jobsheet2;

public class StudentMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        
        mhs1.nama = "Mafaza";
        mhs1.nim = "254107060130";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Faza", "254107060131", 3.20, "TI-1B");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
