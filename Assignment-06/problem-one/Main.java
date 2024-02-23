
import java.util.Scanner;

public class Main {

    public static void printArray(int[] array) {
        System.out.print("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int[] newArray = new int[2*size];

        for(int i=0;i<size;i++){
            newArray[i]=array[i];
            newArray[i+size]=array[i];
        }
        printArray(newArray);
    }
}
