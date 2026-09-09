package Week06;

public class Pgm2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        String s3 = s1 + s2;
        System.out.println(s3);
        String t1 = new String("devika");
        String t2 = new String("ram");
        String res = t1.concat(t2);
        System.out.println(res);
        String s4 = "Hyderabad";
        String s5 = "Hyderabad";
        System.out.println(s4.compareTo(s5));

    }
}
