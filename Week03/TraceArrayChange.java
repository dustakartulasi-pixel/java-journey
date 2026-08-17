package Week03;

public class TraceArrayChange {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 2;

        // Create an independent snapshot
        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // Both references point to the same array
        int[] liveView = original;

        // Update through liveView
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // Display original
        System.out.print("Original: ");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Display snapshot
        System.out.print("Snapshot: ");
        for (int value : snapshot) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Reference comparison
        System.out.println("Same object: " + (original == liveView));

        // Validate requestedIndex before accessing original
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
