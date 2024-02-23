package Makes10;

import java.util.Scanner;

public class Main {
    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        boolean result = makes10(a, b);

        System.out.println("The result is: " + result);
        
        sc.close();
    }
}
