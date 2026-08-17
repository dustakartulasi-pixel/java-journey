package Week03;

/* public class PracticeKod {
    public static void main(String[] args) {
        int[] readings = { 18, 21, 20, 24, 19 };
        int correctionIndex = 2;
        int correction = 3;

        System.out.println("Reading count: " + readings.length);
        System.out.println("Before correction: " + readings[correctionIndex]);

        readings[correctionIndex] += correction;

        System.out.println("After correction: " + readings[correctionIndex]);
        System.out.println("Last valid index: " + (readings.length - 1));
    }
}*/
public class PracticeKod {
    public static void main(String[] args) {

        int[] values = { 10, 20, 30, 40, 50 };
        int bonus = 5;

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + bonus;
        }

        System.out.print("Updated values: ");

        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
