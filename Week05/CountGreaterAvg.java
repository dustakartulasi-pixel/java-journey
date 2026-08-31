package Week05;

import java.util.Scanner;

public class CountGreaterAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        long sum = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = arr[i] + sum;
        }

        double avg = (double) (sum / size);
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println(count);

    }
}
