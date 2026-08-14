package Week01.Week02;

class Student {
    String name;
    int age;
    double height;

    void setStudent(String name, int age, double height) {
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
        Student obj = new Student();
        obj.setStudent("Tulasi", 21, 5.0);

        obj.display();

    }
}
