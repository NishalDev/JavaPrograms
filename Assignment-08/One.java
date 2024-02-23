import java.util.Scanner;

public class One {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        int SN = (n * (n + 1)) / 2;
        int S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        int S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += a[i] * a[i];
        }
        int val1 = S - SN;
        int val2 = S2 - S2N;
        val2 = val2 / val1;
        int x = (val1 + val2) / 2;
        int y = x - val1;
        int[] ans = { x, y };
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "}");
        sc.close();
    }
}
