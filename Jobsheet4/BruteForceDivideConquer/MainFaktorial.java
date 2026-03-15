package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        Factorial fk = new Factorial();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
        
        input.close();
    }
}