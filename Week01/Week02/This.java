package Week01.Week02;

class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
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

public class This {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Raja", 18, 5.5);
        s1.display();
    }
}
