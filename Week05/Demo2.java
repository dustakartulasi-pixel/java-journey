package Week05;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * int[] a = { 1, 2, 4, 5 };
         * int[] b = new int[5];
         * int element = 3;
         * int index = 2;
         * for (int i = 0; i < index; i++) {
         * b[i] = a[i];
         * }
         * b[index] = element;
         * for (int i = index; i < a.length; i++) {
         * b[i + 1] = a[i];
         * }
         * for (int i = 0; i < b.length; i++) {
         * System.out.println(b[i]);
         * }
         */
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[4];
        int index = 2;
        int element = 3;
        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = a[i];

            } else {
                b[i] = a[i + 1];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
