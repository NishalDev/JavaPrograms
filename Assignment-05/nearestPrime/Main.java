package nearestPrime;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int nearestPrime(int x) {
        int lowerPrime = x - 1;
        int upperPrime = x + 1;
        while (true) {
            if (isPrime(lowerPrime)) return lowerPrime;
            if (isPrime(upperPrime)) return upperPrime;
            lowerPrime--;
            upperPrime++;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        int result = nearestPrime(input);
        System.out.println("Nearest Prime of " + input + " is: " + result);
        sc.close();
    }
}
