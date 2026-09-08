package Week06;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "KodNest Technologies";
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.replace('e', 'T'));
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("Technologies", "Softwares"));
        System.out.println(s1.trim());
        System.out.println(s1.substring(2, 13));
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.lastIndexOf('o'));
        System.out.println(s1.concat(" Softwares"));
        System.out.println(s1.startsWith("Kod"));
        System.out.println(s1.endsWith("Technologies"));
        System.out.println(s1.contains("Technologies"));
        char[] c = s1.toCharArray();
        for (char ch : c) {
            System.out.println(ch);
        }
        String[] s2 = s1.split(" ");
        for (String w : s2) {
            System.out.println(w);
        }
        System.out.println(s1.regionMatches(0, "Technologies", 0, 13));
        System.out.println(s1.regionMatches(true, 0, "Technologies", 0, 13));

    }
}
