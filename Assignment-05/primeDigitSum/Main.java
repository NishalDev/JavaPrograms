package primeDigitSum;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean PrimeDigitSum(int x) {
        int sum = 0;
        while (x > 0) {
            int digit = x % 10;
            if (isPrime(digit)) sum += digit;
            x /= 10;
        }
        return isPrime(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        boolean result = PrimeDigitSum(input);
        System.out.println(result);
        sc.close();
    }
}
