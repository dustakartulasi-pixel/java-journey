package Week05;

public class Demo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[6];
        System.out.println("The elements of the array are");
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            System.out.println(arr[i]);
        }
        int element = 6;
        arr2[arr2.length - 1] = element;
        System.out.println("The elements of the array are copied to another array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
