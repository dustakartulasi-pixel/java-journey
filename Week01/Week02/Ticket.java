package Week01.Week02;

import java.util.Scanner;

class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;
}

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket s1 = new SupportTicket();
        System.out.println("Enter ticket id: ");
        s1.id = scanner.nextInt();
        System.out.println("Enter priority: ");
        s1.priority = scanner.nextInt();
        System.out.println("Enter waiting minutes: ");
        s1.waitingMinutes = scanner.nextInt();

        SupportTicket s2 = new SupportTicket();
        System.out.println("Enter ticket id: ");
        s2.id = scanner.nextInt();
        System.out.println("Enter priority: ");
        s2.priority = scanner.nextInt();
        System.out.println("Enter waiting minutes: ");
        s2.waitingMinutes = scanner.nextInt();

        SupportTicket s3 = new SupportTicket();
        System.out.println("Enter ticket id: ");
        s3.id = scanner.nextInt();
        System.out.println("Enter priority: ");
        s3.priority = scanner.nextInt();
        System.out.println("Enter waiting minutes: ");
        s3.waitingMinutes = scanner.nextInt();

        SupportTicket selected = s1;

        if ((s2.priority > selected.priority)
                || (s2.priority == selected.priority && s2.waitingMinutes > selected.waitingMinutes)
                || (s2.priority == selected.priority && s2.waitingMinutes == selected.waitingMinutes
                        && s2.id < selected.id)) {
            selected = s2;
        }

        if ((s3.priority > selected.priority)
                || (s3.priority == selected.priority && s3.waitingMinutes > selected.waitingMinutes)
                || (s3.priority == selected.priority && s3.waitingMinutes == selected.waitingMinutes
                        && s3.id < selected.id)) {
            selected = s3;
        }

        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);

        scanner.close();
    }
}