package Week04;
import java.util.Scanner;
public class CompareSameArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array");

        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean identical = true;

        if (size1 != size2) {
            identical = false;
        } else {
            for (int i = 0; i < size1; i++) {
                if (arr1[i] != arr2[i]) {
                    identical = false;
                    break;
                }
            }
        }

        if (identical==true) {
            System.out.println("Arrays are identical");
            System.out.println(1);
        } else {
            System.out.println("Arrays are not identical");
            System.out.println(0);
        }
    }
}

