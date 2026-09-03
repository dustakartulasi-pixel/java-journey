package Week05;

import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] prefixSum = new int[arr.length];
        System.out.println("Original Array is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }

    }

}
