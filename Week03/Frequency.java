package Week03;

class Freq {
    void findFreq(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("FREQUENCY IS:" + count);
    }
}

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 10, 20 };
        Freq f = new Freq();
        f.findFreq(arr, 10);

    }

}
