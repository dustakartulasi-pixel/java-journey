package Week05;

import java.util.Arrays;

public class Sufix {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] suFixSum = new int[arr.length];
        System.out.println("Original Array is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            suFixSum[i] = sum;
        }
        System.out.println("Sufix Array: " + Arrays.toString(suFixSum));
    }

}
