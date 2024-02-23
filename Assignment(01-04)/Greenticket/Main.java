/*You have a green lottery ticket, with ints a, b, and c on it. 
If the numbers are all different from each other, the result is 0. 
If all of the numbers are the same, the result is 20. 
If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */


package Greenticket;

import java.util.Scanner;

public class Main {
    int a, b, c;

    public Main(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculateResult() {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = s.nextInt();

        System.out.print("Enter the second number: ");
        int b = s.nextInt();

        System.out.print("Enter the third number: ");
        int c = s.nextInt();

        Main obj = new Main(a, b, c);
        int result = obj.calculateResult();
        System.out.println("The result is: " + result);

        s.close();
    }
}
