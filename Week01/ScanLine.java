package Week01;

import java.util.Scanner;

public class ScanLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Name is: " + name);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Age is : " + age);
        System.out.println("Enter college:");
        sc.nextLine();
        String college = sc.nextLine();
        System.out.println("College is: " + college);
        sc.close();

    }

}
