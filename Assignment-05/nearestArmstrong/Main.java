package nearestArmstrong;

import java.util.Scanner;

public class Main {

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }
        return sum == original;
    }

    public static int nearestArmstrong(int x) {
        int lowerArmstrong = x - 1;
        int upperArmstrong = x + 1;
        while (true) {
            if (isArmstrong(lowerArmstrong)) return lowerArmstrong;
            if (isArmstrong(upperArmstrong)) return upperArmstrong;
            lowerArmstrong--;
            upperArmstrong++;
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        int result = nearestArmstrong(input);
        System.out.println("Nearest Armstrong of " + input + " is: " + result);
        sc.close();
    }
}
