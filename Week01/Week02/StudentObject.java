package Week01.Week02;

import java.util.Scanner;

public class StudentObject {

    static class Student {
        int registrationId;
        String name;
        double attendancePercentage;

        Student() {}

        Student(int registrationId, String name, double attendancePercentage) {
            this.registrationId = registrationId;
            this.name = name;
            this.attendancePercentage = attendancePercentage;
        }

        void display() {
            System.out.println(registrationId + " - " + name + " - " + attendancePercentage + "%");
        }
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a numeric ID: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double readDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a valid number for attendance: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int id1 = readInt(scanner, "Enter Student 1 registrationId: ");
        System.out.println("Enter Student 1 name: ");
        String name1 = scanner.next();
        double attendance1 = readDouble(scanner, "Enter Student 1 attendancePercentage: ");
        Student s1 = new Student(id1, name1, attendance1);

        int id2 = readInt(scanner, "Enter Student 2 registrationId: ");
        System.out.println("Enter Student 2 name: ");
        String name2 = scanner.next();
        double attendance2 = readDouble(scanner, "Enter Student 2 attendancePercentage: ");
        Student s2 = new Student(id2, name2, attendance2);

        int selectId = readInt(scanner, "Enter the registrationId to update: ");

        double newAttendance = readDouble(scanner, "Enter the new attendancePercentage: ");
        Student selectedStudent = null;
        if (selectId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectId == s2.registrationId) {
            selectedStudent = s2;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }
        s1.display();
        s2.display();
        scanner.close();
    }

}
