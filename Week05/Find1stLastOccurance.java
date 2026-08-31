package Week05;

import java.util.Scanner;

public class Find1stLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
        sc.close();
    }
}