package KodNest75;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st word: ");
        String w1 = sc.next();
        System.out.print("Enter 2nd word: ");
        String w2 = sc.next();
        StringBuilder res = new StringBuilder();
        int i=0;
        int j=0;
        while(i<w1.length() || j<w2.length()){
            if(i<w1.length()){
                res.append(w1.charAt(i));
                i++;
            }
            if(j<w2.length()){
                res.append(w2.charAt(j));
                j++;
            }
        }
        System.out.println(res.toString());
        
    }
}
