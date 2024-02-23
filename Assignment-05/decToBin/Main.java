package decToBin;

import java.util.Scanner;

public class Main {
    
    public static long convertToBinary(int n) {
        long ans = 0;
        int i = 0;
        while (n != 0) {
            int bit = n & 1;
            ans = (bit * (long) Math.pow(10, i)) + ans;
            n = n >> 1;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        long result = convertToBinary(input);
        System.out.println("Result : " + result);
        sc.close();
    }
}
