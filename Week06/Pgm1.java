package Week06;

class pgm1 {
    public static void main(String[] args) {
        String s1 = "Java1";
        String s2 = "Java";
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        char[] arr = s1.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }

    }
}