package Week03;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];

        // Taking columns for each row
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols];
        }

        // Taking elements
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements for row " + i + ":");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing
        System.out.println("Jagged Array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
