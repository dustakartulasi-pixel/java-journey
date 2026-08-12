package Week01.Week02;

class School {
    void student(short a, short b) {
        System.out.println(a + " " + b);
    }

    void student(int a, int b) {
        System.out.println(a + " " + b);

    }
}

public class Ambignity {
    public static void main(String[] args) {
        School obj = new School();
        obj.student(10, 20);
    }

}
