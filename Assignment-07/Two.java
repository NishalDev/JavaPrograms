import java.util.Scanner;

public class Two {
    public static int MissingNumber(int[] arr, int size) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }

        for (int i = 1; i <= size; i++) {
            result ^= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int missingNumber = MissingNumber(arr, size);
        System.out.println("Missing number: " + missingNumber);
        sc.close();
    }
}
