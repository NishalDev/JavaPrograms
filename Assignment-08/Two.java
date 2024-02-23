import java.util.Scanner;

public class Two {
    public static int[] find(int[] arr, int n, int x) {
        int first = -1;
        int last = -1;

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int result[] = { first, last };
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result = find(arr, n, x);
        System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
        sc.close();
    }
}
