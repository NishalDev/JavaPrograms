package SumPrime;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sumPrime(int a, int b) {
        if (isPrime(a) && isPrime(b)) {
            int sum = a + b;
            return isPrime(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Result: " + sumPrime(a, b));
        sc.close();
    }
}
