package Week03;

import java.util.Scanner;

public class ArrayCheckPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of 1D array");
        int one = sc.nextInt();

        int[] arrOne = new int[one];

        System.out.println("Enter 1D array elements");
        for (int i = 0; i < one; i++) {
            arrOne[i] = sc.nextInt();
        }

        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter matrix elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int tot1 = 0;

        for (int i = 0; i < one; i++) {
            tot1 = tot1 + arrOne[i];
        }

        int tot2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tot2 = tot2 + arr[i][j];
            }
        }

        System.out.println("Array total: " + tot1);
        System.out.println("Matrix total: " + tot2);
    }
}
