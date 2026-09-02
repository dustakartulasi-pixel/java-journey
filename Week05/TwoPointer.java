package Week05;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int tem = arr[left];
            arr[left] = arr[right];
            arr[right] = tem;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
