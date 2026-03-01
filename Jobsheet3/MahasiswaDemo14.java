package Jobsheet3;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Student14[] arrayOfMahasiswa = new Student14[3];

        arrayOfMahasiswa[0] = new Student14();
        arrayOfMahasiswa[0].nim = "101";
        arrayOfMahasiswa[0].nama = "Andi";
        arrayOfMahasiswa[0].kelas = "TI-1A";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Student14();
        arrayOfMahasiswa[1].nim = "102";
        arrayOfMahasiswa[1].nama = "Budi";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = (float) 3.50;

        arrayOfMahasiswa[2] = new Student14();
        arrayOfMahasiswa[2].nim = "103";
        arrayOfMahasiswa[2].nama = "Cici";
        arrayOfMahasiswa[2].kelas = "TI-1C";
        arrayOfMahasiswa[2].ipk = (float) 3.90;

        System.out.println("NIM      : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[2].ipk);
        System.out.println("-----------------------------------------");
    }
}
