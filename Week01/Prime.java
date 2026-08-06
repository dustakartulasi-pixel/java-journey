public class Prime {
    public static void main(String[] args) {
        int num = 10;
        int check = 2;
        while (check < num) {
            if (num % check == 0) {
                System.out.println("Not prime");
            }
            check++;
        }

        System.out.println("Prime Number");
    }
}