package Week08;

import java.util.Scanner;

class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;

    }

    public int displayAge() {
        return age;
    }
}
// Create setAge()
// Create displayAge()

public class StudentAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        Student obj = new Student();
        obj.setAge(age);
        System.out.println(obj.displayAge());
        // Complete the program
    }
}
