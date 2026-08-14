package Week01.Week02;

class Student {
    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class Contrustor {
    public static void main(String[] args) {
        Student obj = new Student("Tulasi", 22, 5.2);
        obj.display();

    }
}
