package ReverseOfx;

import java.util.Scanner;

public class Main {
    public static int reverseOfX(int x) {
        int reversed = 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        int reverse = reverseOfX(input);
        System.out.println("Reverse of " + input + " is: " + reverse);
        sc.close();
    }
}
