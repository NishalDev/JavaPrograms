package primeFib;

import java.util.Scanner;

public class Main {

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b += temp;
        }
        return a == n;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int nearestFibonacciPrime(int x) {
        int lowerFib = x - 1;
        int upperFib = x + 1;
        while (true) {
            if (isFibonacci(lowerFib) && isPrime(lowerFib))
                return lowerFib;
            if (isFibonacci(upperFib) && isPrime(upperFib))
                return upperFib;
            lowerFib--;
            upperFib++;
        }
    }

    public static int primeFib(int x) {
        if (isFibonacci(x) && isPrime(x))
            return x;
        else
            return nearestFibonacciPrime(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        int result = primeFib(input);
        System.out.println("Result : " + result);
        sc.close();
    }
}
