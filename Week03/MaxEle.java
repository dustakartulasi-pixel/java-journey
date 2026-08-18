package Week03;

public class MaxEle {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 30, 15 };
        /*
         * int max = arr[0];
         * for (int i = 1; i < arr.length; i++) {
         * if (arr[i] > max) {
         * max = arr[i];
         * }
         * }
         * System.out.println("The maximum element in the array is: " + max);
         */
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
