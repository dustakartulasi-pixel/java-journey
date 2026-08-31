package Week05;

import java.util.Scanner;

public class ClosetestTarget {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        int closest = arr[0];

        long diff = arr[0] - target;

        if (diff < 0) {
            diff = -diff;
        }

        for (int i = 1; i < n; i++) {

            long currentDiff = arr[i] - target;

            if (currentDiff < 0) {
                currentDiff = -currentDiff;
            }

            if (currentDiff < diff) {
                diff = currentDiff;
                closest = arr[i];
            } else if (currentDiff == diff && arr[i] < closest) {
                closest = arr[i];
            }
        }

        System.out.println(closest);
    }
}
