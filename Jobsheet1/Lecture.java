import java.util.Scanner;
public class Lecture {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] schedule = new String[n][4];

        inputSchedule(schedule);
        displayAll(schedule);
        displayByDay(schedule);
        displayByCourse(schedule);

        input.close();
    }

    public static void inputSchedule(String[][] schedule) {

        for (int i = 0; i < schedule.length; i++) {
            System.out.println("Jadwal ke-" + (i+1));

            System.out.print("Nama Mata Kuliah: ");
            schedule[i][0] = input.nextLine();
            System.out.print("Ruangan: ");
            schedule[i][1] = input.nextLine();
            System.out.print("Hari: ");
            schedule[i][2] = input.nextLine();
            System.out.print("Jam: ");
            schedule[i][3] = input.nextLine();
        }
    }

    public static void displayAll(String[][] schedule) {
        System.out.println("\nSemua Jadwal:");
        System.out.println("==================================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n",
                "Course", "Room", "Day", "Hours");
        for (int i = 0; i < schedule.length; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }
    }

    public static void displayByDay(String[][] schedule) {
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String day = input.nextLine();
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.printf("%-20s %-15s %-10s %-15s\n",
                        schedule[i][0],
                        schedule[i][1],
                        schedule[i][2],
                        schedule[i][3]);
            }
        }
    }

    public static void displayByCourse(String[][] schedule) {
        System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
        String course = input.nextLine();
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.printf("%-20s %-15s %-10s %-15s\n",
                        schedule[i][0],
                        schedule[i][1],
                        schedule[i][2],
                        schedule[i][3]);
            }
        }
    }
}
