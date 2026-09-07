package Week06;

import java.util.Scanner;

public class VowelInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        scanner.close();
        int vowelCount = 0;
        text = text.toLowerCase();
        // Traverse the text and update vowelCount.
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
    }
}
