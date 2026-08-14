package Week01.Week02;

class Student {
    String name;
    int age;
    double height;

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Contrustor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();

    }
}
