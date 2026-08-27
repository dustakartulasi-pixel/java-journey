package Week04;

import java.util.Scanner;

public class CountPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0;
        int neg = 0;
        int zer = 0;

        for (int i = 0; i < size; i++) {

            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zer++;
            }
        }

        System.out.println(pos + " " + neg + " " + zer);

        sc.close();
    }
}
