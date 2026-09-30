package Week08;

import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println(name);

    }
}

class Student extends Person {
}

public class Inheritence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();
        Person person = new Person();
        person.setName(name);
        person.displayName();

    }
}