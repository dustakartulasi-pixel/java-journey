package Week04;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the lower bound");
        int lower = s.nextInt();
        System.out.println("Enter the upper bound");
        int upper = s.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}