package Week06;

import java.util.Scanner;

public class TraceingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String original = scanner.nextLine();
        String res = original.toUpperCase();
        System.out.println("Original: " + original);
        System.out.println("After ignored call: " + original);
        System.out.println("Uppercase copy: " + res);
        scanner.close();

    }
}