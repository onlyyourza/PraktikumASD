package Jobsheet4.BruteForceDivideConquer;

public class StudentAssignment {

    public static double maxUtsDC(Student[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        double leftMax = maxUtsDC(arr, l, mid);
        double rightMax = maxUtsDC(arr, mid + 1, r);
        
        return Math.max(leftMax, rightMax); 
    }

    public static double minUtsDC(Student[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        double leftMin = minUtsDC(arr, l, mid);
        double rightMin = minUtsDC(arr, mid + 1, r);
        
        return Math.min(leftMin, rightMin);
    }

    public static double averageUasBF(Student[] arr) {
        double totalUas = 0;
        for (int i = 0; i < arr.length; i++) {
            totalUas += arr[i].uas;
        }
        return totalUas / arr.length;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Ahmad", "220101001", 2022, 78, 82),
            new Student("Budi", "220101002", 2022, 85, 88),
            new Student("Cindy", "220101003", 2021, 90, 87),
            new Student("Dian", "220101004", 2021, 76, 79),
            new Student("Eko", "220101005", 2023, 92, 95),
            new Student("Fajar", "220101006", 2020, 88, 85),
            new Student("Gina", "220101007", 2023, 80, 83),
            new Student("Hadi", "220101008", 2020, 82, 84)
        };

        int n = students.length;

        System.out.println("--- Assignment 5.5 Results ---");
        System.out.println("Highest Midterm Score (UTS) [DC]: " + maxUtsDC(students, 0, n - 1));
        System.out.println("Lowest Midterm Score (UTS) [DC]: " + minUtsDC(students, 0, n - 1));
        System.out.println("Average Final Score (UAS) [BF]: " + averageUasBF(students));
    }
}
