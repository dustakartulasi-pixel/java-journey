package Week06;

import java.util.Scanner;

public class WidestRepetation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSpan = -1;
        int bestValue = 0;

        for (int i = 0; i < n; i++) {
            boolean alreadyProcessed = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (!alreadyProcessed) {
                int lastIndex = i;
                for (int j = n - 1; j >= i; j--) {
                    if (arr[j] == arr[i]) {
                        lastIndex = j;
                        break;
                    }
                }

                int currentSpan = lastIndex - i;
                if (currentSpan > maxSpan) {
                    maxSpan = currentSpan;
                    bestValue = arr[i];
                }
            }
        }

        System.out.println(bestValue + " " + maxSpan);
        scanner.close();
    }
}
