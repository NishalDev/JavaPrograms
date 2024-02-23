import java.util.Scanner;

public class Main {
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] mat1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] mat2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] result = multiplyMatrices(mat1, mat2);
            System.out.println("The Result is : ");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
