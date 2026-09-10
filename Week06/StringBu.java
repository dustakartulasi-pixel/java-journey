package Week06;

/**
 * StringBu
 */
public class StringBu {

    public static void main(String args[]) {
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append("Java");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append(" is a programming language");
        System.out.print(s1);
        System.out.println(s1.capacity());
        System.out.println(s1.length());

    }
}