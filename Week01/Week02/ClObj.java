package Week01.Week02;

public class ClObj {

    static class Student {
        int roll;
        String name;
        double height;

        void run() {
            System.out.println("Student is running");
        }

        void sleep() {
            System.out.println("Student is sleeping");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }

}
