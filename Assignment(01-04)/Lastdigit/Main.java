import java.util.Scanner;

public class Main {

    public static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10 ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int b = sc.nextInt();

        boolean result = lastDigit(a, b);

        System.out.println("The last digits are the same: " + result);

        sc.close();
    }
}

