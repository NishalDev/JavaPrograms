package In1020;

import java.util.Scanner;

public class Main {

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        boolean result = in1020(a, b);

        System.out.println("The result is: " + result);

        sc.close();
    }

}
