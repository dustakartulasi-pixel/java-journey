package Week05;

import java.util.Scanner;

public class SecoundLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int first = arr[0];
            int sec = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                if (arr[j] > first) {
                    sec = first;
                    first = arr[j];
                } else if (arr[j] > sec && arr[j] != first) {
                    sec = arr[j];

                }

            }

            if (sec == Integer.MIN_VALUE) {
                System.out.println("No second largest distinct value");
            } else {
                System.out.println(sec);

            }

        }
    }
}
