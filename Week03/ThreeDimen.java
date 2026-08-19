package Week03;

import java.util.Scanner;

public class ThreeDimen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        // Taking input
        System.out.println("Enter the 3D array elements");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing output
        System.out.println("The 3D array elements are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
