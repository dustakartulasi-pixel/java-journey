package Week03;

import java.util.Scanner;

/*public class Analyse {
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
}*/
/*public class Analyse {
    public static void main(String[] args) {
        int[] marks = { 70, 80, 60, 90, 50 };
        int tot = 0;
        double avg;
        for (int i = 0; i <= marks.length - 1; i++) {
            tot += marks[i];
        }
        System.out.println("Total: " + tot);
        avg = tot / 5;
        System.out.println("Average: " + avg);
        // Write your code here
    }

}*/
public class Analyse {
    public static void main(String[] args) {
        int[] stock = { 4, 12, 2, 9, 5 };
        int reorderLevel = 5;
        int count = 0;
        for (int i = 0; i <= stock.length - 1; i++) {
            if (stock[i] <= reorderLevel) {
                count++;
            }
        }

        System.out.println("Items to reorder: " + count);
    }
}