package Sum;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Ask the user to input array elements
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Close the scanner after input is done
        scanner.close();

        // Variable to store the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
