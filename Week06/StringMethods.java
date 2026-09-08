package Week06;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(5));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace("Java", "Python"));
        System.out.println(str.equals("Java"));
        System.out.println(str.equalsIgnoreCase("Java"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("fun"));
        System.out.println(str.contains("is"));
        System.out.println(str.trim());
        System.out.println(str.isEmpty());
        System.out.println(str.length());
    }
}