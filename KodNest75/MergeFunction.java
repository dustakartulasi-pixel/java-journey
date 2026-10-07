package KodNest75;
import java.util.Scanner;
public class MergeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st word: ");
        String w1 = sc.next();
        System.out.print("Enter 2nd word: ");
        String w2 = sc.next();
        System.out.println(mergeAlternately(w1, w2));
        sc.close();
    }
    
    public static String mergeAlternately(String w1, String w2) {
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();
        while (i < w1.length() || j < w2.length()) {
            if (i < w1.length()) {
                res.append(w1.charAt(i));
                i++;
            }
            if (j < w2.length()) {
                res.append(w2.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}

