package KodNest75;

import java.util.Scanner;

public class GreatestChoco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();
        System.out.print("Enter Number Extra chocolate you want to give to every one: ");
        int extraChoco = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of chocolates for person " + i+ ": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
               max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i] + extraChoco;
            if(arr[i]>max){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

    }
}