package Jobsheet3;
import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of lecturers: ");
        int n = Integer.parseInt(sc.nextLine());

        Dosen14[] arrayOfDosen = new Dosen14[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input lecturer data #" + (i + 1));

            System.out.print("Code   : ");
            String code = sc.nextLine();

            System.out.print("Name   : ");
            String name = sc.nextLine();

            System.out.print("Gender (M/F): ");
            String g = sc.nextLine();
            boolean gender = g.equalsIgnoreCase("M");

            System.out.print("Age    : ");
            int age = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen14(code, name, gender, age);
            System.out.println("----------------------------");
        }

        DataDosen14 data = new DataDosen14();

        data.dataAllDosen(arrayOfDosen);
        data.numberOfLecturersPerGender(arrayOfDosen);
        data.AverageAgeOfLecturersPerGender(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenMostYoungest(arrayOfDosen);

        sc.close();
    }
}