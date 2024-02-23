package Sumdouble;

import java.util.Scanner;

public class Main {
    
    public static int sumDouble(int a, int b) {
        return a != b ? a + b : 2 * (a + b);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        int result = sumDouble(a, b);

        System.out.println("The result is: " + result);

        sc.close();
    }

    
}
