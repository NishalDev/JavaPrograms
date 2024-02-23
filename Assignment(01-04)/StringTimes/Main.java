package StringTimes;

import java.util.Scanner;

public class Main {
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = "Hi";

        System.out.print("Enter the number of times to repeat: ");
        int repeatCount = sc.nextInt();

        String repeatedString = stringTimes(originalString, repeatCount);
        System.out.println("Result: " + repeatedString);

        sc.close();
    }
}
