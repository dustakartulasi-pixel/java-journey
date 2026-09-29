package KodNest75;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings to merge alternately:");
        String word1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String word2 = scanner.nextLine();
        System.out.println(mergeAlternately(word1, word2));
        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }

        return result.toString();
    }
}
