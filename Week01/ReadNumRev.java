package Week01;

import java.util.Scanner;

public class ReadNumRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Reverse: ");
        int num = sc.nextInt();
        int rev = 0;
        int ans = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rev);
        if (ans == rev) {
            System.out.println("Number is Polynomial ");
        } else {
            System.out.println("not Polynomial number");
        }

    }
}
