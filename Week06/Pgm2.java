package Week06;

public class Pgm2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("JaVa");
        if (s1 == s2) {
            System.out.println("Both refer to same object");
        } else {
            System.out.println("Both refer to different object");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
