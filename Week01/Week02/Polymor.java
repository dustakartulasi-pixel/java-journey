package Week01.Week02;

class Addidtion {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, double b, int c) {
        return a + b + c;
    }

    double add(double a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, double c) {
        return a + b + c;
    }
}

public class Polymor {
    public static void main(String[] args) {
        Addidtion a1 = new Addidtion();
        a1.add(10, 20);
        a1.add(10, 20.5);
    }

}
