package Week03;

class SearchArray {
    void search(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
}

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 16, 29, 11, 18, 4 };
        SearchArray s = new SearchArray();
        s.search(arr, 29);

    }

}
