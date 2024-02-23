package fibPrime;

import java.util.Scanner;

public class Main{

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b += temp;
        }
        return a == n;
    }

    public static boolean isPrimeFibonacci(int n) {
        return isFibonacci(n) && isPrime(n);
    }

    public static void FibPrime(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (isPrimeFibonacci(i)) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value 1: ");
        int input_1 = sc.nextInt();
        System.out.print("Enter an integer value 2: ");
        int input_2 = sc.nextInt();
        FibPrime(input_1,input_2);
        sc.close();
    }

}