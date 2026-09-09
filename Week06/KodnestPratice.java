package Week06;

import java.util.Scanner;

public class KodnestPratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course name");
        String courseName = sc.nextLine();
        System.out.println("Enter the trainer name");
        String traineName = sc.nextLine();
        System.out.println("Course: " + courseName);
        System.out.println("Trainer: " + traineName);
        sc.close();
        // Read and display the course and trainer names.

    }
}
