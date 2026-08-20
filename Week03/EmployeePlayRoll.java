package Week03;

import java.util.Scanner;

class Employee {

    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Zero-parameter constructor
    Employee() {
        employeeId = 0;
        employeeName = "";
        basicSalary = 0.0;
        bonus = 0.0;
    }

    // Parameterized constructor
    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Method 1: Set Employee Details
    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Method 2: Add Fixed Bonus
    void addBonus(double bonusAmount) {
        bonus = bonus + bonusAmount;
    }

    // Method 3: Add Percentage Bonus
    void addBonus(double bonusPercentage, double extraReward) {

        double percentageBonus;
        double additionalBonus;

        percentageBonus = basicSalary * bonusPercentage / 100;
        additionalBonus = percentageBonus + extraReward;

        bonus = bonus + additionalBonus;
    }

    // Method 4: Calculate Total Salary
    double calculateTotalSalary() {

        double totalSalary;

        totalSalary = basicSalary + bonus;

        return totalSalary;
    }

    // Method 5: Display Employee
    void displayEmployee() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class EmployeePlayRoll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Employee 1 --------

        System.out.print("Enter Employee 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 1 Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Employee 1 Basic Salary: ");
        double salary1 = sc.nextDouble();

        System.out.print("Enter Employee 1 Fixed Bonus: ");
        double fixedBonus = sc.nextDouble();

        // Create using zero-parameter constructor
        Employee employee1 = new Employee();

        // Set employee details
        employee1.setEmployeeDetails(id1, name1, salary1);

        // Add fixed bonus
        employee1.addBonus(fixedBonus);


        // -------- Employee 2 --------

        System.out.print("Enter Employee 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 2 Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Employee 2 Basic Salary: ");
        double salary2 = sc.nextDouble();

        System.out.print("Enter Employee 2 Initial Bonus: ");
        double initialBonus = sc.nextDouble();

        System.out.print("Enter Employee 2 Bonus Percentage: ");
        double bonusPercentage = sc.nextDouble();

        System.out.print("Enter Employee 2 Extra Reward: ");
        double extraReward = sc.nextDouble();

        // Create using parameterized constructor
        Employee employee2 = new Employee(
                id2,
                name2,
                salary2,
                initialBonus
        );

        // Add percentage bonus
        employee2.addBonus(bonusPercentage, extraReward);


        // -------- Display --------

        System.out.println("\nEmployee 1");
        employee1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        employee2.displayEmployee();

        sc.close();
    }
}
