package Week03;

import java.util.Scanner;

public class WaterTank {

    int capacity;
    int currentLevel;

    // Constructor
    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    // Method 1: Fill Water
    int fillWater(int amount) {

        if (amount <= 0) {
            return 0;
        }

        int availableSpace = capacity - currentLevel;

        if (amount <= availableSpace) {
            currentLevel += amount;
            return amount;
        } else {
            currentLevel += availableSpace;
            return availableSpace;
        }
    }

    // Method 2: Drain Water
    int drainWater(int amount) {

        if (amount <= 0) {
            return 0;
        }

        if (amount <= currentLevel) {
            currentLevel -= amount;
            return amount;
        } else {
            int actualRemoved = currentLevel;
            currentLevel = 0;
            return actualRemoved;
        }
    }

    // Method 3: Get Tank Status
    String getStatus() {

        double fillPercentage = currentLevel * 100.0 / capacity;

        if (currentLevel == 0) {
            return "Empty";
        } else if (fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage <= 75) {
            return "Medium";
        } else if (currentLevel < capacity) {
            return "High";
        } else {
            return "Full";
        }
    }

    // Method 4: Display Tank
    void displayTank() {

        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + (capacity - currentLevel));
        System.out.println("Status: " + getStatus());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the tank: ");
        int capacity = sc.nextInt();
        System.out.println("Enter the current level of the tank: ");
        int currentLevel = sc.nextInt();
        System.out.println("Enter the number of operations: ");
        int operations = sc.nextInt();
        WaterTank tank = new WaterTank(capacity, currentLevel);
        for (int i = 1; i <= operations; i++) {
            System.out.println("Enter the operation number: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the amount of water to fill: ");
                    int fillAmount = sc.nextInt();

                    int actualFilled = tank.fillWater(fillAmount);

                    System.out.println(
                            "Operation " + i + " - Filled: " + actualFilled);
                    break;

                case 2:
                    // Drain water
                    System.out.println("Enter the amount of water to drain: ");
                    int drainAmount = sc.nextInt();

                    int actualDrained = tank.drainWater(drainAmount);

                    System.out.println(
                            "Operation " + i + " - Drained: " + actualDrained);
                    break;

                case 3:
                    System.out.println(
                            "Operation " + i + " - Tank Status");

                    tank.displayTank();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.out.println("Final Tank Status");
        tank.displayTank();

        sc.close();
    }
}
