package Week01.Week02;

import java.util.Scanner;

class Conductor {
    void collect(Money m) {
        System.out.println("Money Collected by Conductor");
    }

    Ticket gives() {
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }
}

class Money {

}

class Ticket {
}

public class Passenger {
    public static void main(String[] args) {
        Conductor c1 = new Conductor();
        Money m1 = new Money();
        Ticket t1 = c1.gives();
        System.out.println(t1);
        if (t1 != null) {
            System.out.println("Ticket Obtained");
            c1.collect(m1);
            System.out.println("Money Obtained");

        }

    }

}

