package ZeroConverter;

import java.util.Scanner;

public class Main {
    public static void pos(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void neg(int n) {
        for (int i = n; i <= 0; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Number is already Zero");
        } else {
            if (n > 0) {
                pos(n);
            } else {
                neg(n);
            }
            sc.close();
        }
    }
}
