package Week05;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sorted = 1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                sorted = 0;
                break;
            }
        }
        System.out.println(sorted);
        sc.close();
    }
}
