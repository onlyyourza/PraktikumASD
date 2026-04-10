package Jobsheet6;

public class SortingMain14 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting14 sorting1 = new Sorting14(a);

        System.out.println("Original array:");
        sorting1.print();
        
        sorting1.bubbleSort();
        
        System.out.println("Sorted array (Bubble Sort):");
        sorting1.print();

        System.out.println("\n---------------------------\n");

        int[] b = {30, 20, 2, 8, 14};
        Sorting14 sorting2 = new Sorting14(b);

        System.out.println("Original array:");
        sorting2.print();
        
        sorting2.selectionSort();
        
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();
    }
}
