package Week03;

import java.util.Scanner;

public class BeginnerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter Array value of index" + i + ": ");
            marks[i] = sc.nextInt();
        }

        // for (int i = 0; i <= marks.length - 1; i++) {
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        sc.close();
    }

}
