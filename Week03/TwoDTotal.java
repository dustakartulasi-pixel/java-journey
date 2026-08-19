package Week03;

import java.util.Scanner;

public class TwoDTotal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int classes = scanner.nextInt();
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        int[][] attendance = new int[classes][days];

        // Read the matrix
        System.out.println("Enter attendance data (" + classes + " x " + days + "):");
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        // Calculate total attendance for each day
        for (int j = 0; j < days; j++) {
            int total = 0;

            for (int i = 0; i < classes; i++) {
                total = total + attendance[i][j];
            }

            System.out.println("Day " + (j + 1) + " total: " + total);
        }
    }
}
