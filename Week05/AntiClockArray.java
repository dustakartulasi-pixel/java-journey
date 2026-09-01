package Week05;

public class AntiClockArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int[] b = new int[a.length];
        int first = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        b[a.length - 1] = first;

        for (int i = 0; i < a.length; i++) {
            System.out.print(+b[i] + " ");
        }
    }

}
