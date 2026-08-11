package Week01.Week02;

class Employee {
    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

public class ReferenceAssgin {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Tulasi";
        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2 = e1;
        e2.id = 102;
        e2.name = "Sonuu";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.id = 103;
        e1.name = "Tullu";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
    }

}
