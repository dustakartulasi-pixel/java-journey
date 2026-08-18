package Week03;

import java.util.Scanner;

public class Analyse {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("Total: " + sum);
        sc.close();
    }
}