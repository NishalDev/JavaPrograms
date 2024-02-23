package Even;

import java.util.Scanner;

public class Main {

    public static boolean Even(int n) {
        return n % 2 == 0 ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean isEven = Even(n);

        System.out.println("The number is even: " + (isEven ? "True" : "False"));

        sc.close();
    }
}
