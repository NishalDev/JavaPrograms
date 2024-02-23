package Series;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a = sc.nextInt();
        System.out.println("Enter value for b : ");
        int b = sc.nextInt();
        System.out.println("Enter value for c : ");
        int n = sc.nextInt();
        
        int[] series = generateSeries(a, b, n);
        System.out.println("The Generated Series is : ");
        for (int i = 0; i < series.length; i++) {
            System.out.print(series[i] + " ");
        }
        sc.close();
    }
    
    public static int[] generateSeries(int a, int b, int n) {
        int[] series = new int[n];
        int currentSum = a;
        
        for (int i = 0; i < n; i++) {
            currentSum += Math.pow(2, i) * b;
            series[i] = currentSum;
        }
        return series;
    }
}
