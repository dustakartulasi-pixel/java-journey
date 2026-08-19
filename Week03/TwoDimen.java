package Week03;

import java.util.Scanner;

public class TwoDimen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeR = sc.nextInt();
        int sizeC = sc.nextInt();
        int a[][] = new int[sizeR][sizeC];
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }

}