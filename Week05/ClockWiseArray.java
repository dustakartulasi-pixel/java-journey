package Week05;

public class ClockWiseArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int[] b = new int[a.length];
        int last = a[a.length - 1];

        b[0] = last;

        for (int i = 0; i < a.length - 1; i++) {
            b[i + 1] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
