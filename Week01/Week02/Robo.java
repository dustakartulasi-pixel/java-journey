package Week01.Week02;

import java.util.Scanner;

class PracticeTask {
    int id;
}

public class Robo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PracticeTask t1 = new PracticeTask();
        System.out.println("Enter first task id: ");
        t1.id = scanner.nextInt();

        PracticeTask t2 = new PracticeTask();
        System.out.println("Enter second task id: ");
        t2.id = scanner.nextInt();

        PracticeTask t3 = new PracticeTask();
        System.out.println("Enter third task id: ");
        t3.id = scanner.nextInt();

        int unreachableId = t1.id;
        System.out.println("Unreachable Object: " + unreachableId);

        PracticeTask relay = t1;
        System.out.println("Relay Reference: " + relay.id);

        t1 = t2;
        System.out.println("First Reference: " + t1.id);

        t2 = t3;
        System.out.println("Second Reference: " + t2.id);

        relay = t2;
        System.out.println("Relay Reference: " + relay.id);

        t3 = t1;

        System.out.println("First Reference: " + t1.id);
        System.out.println("Second Reference: " + t2.id);
        System.out.println("Third Reference: " + t3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);

        scanner.close();
    }

}
