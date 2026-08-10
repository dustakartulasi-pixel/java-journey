package Week01.Week02;

import java.util.Scanner;

class PracticeProfile {
    String name;
    int points;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int initialPoints = sc.nextInt();
        int boost = sc.nextInt();
        int correction = sc.nextInt();

        // Step 1: create live object
        PracticeProfile live = new PracticeProfile();
        live.name = name;
        live.points = initialPoints;

        // Step 2: alias points to same object
        PracticeProfile alias = live;

        // Step 3: apply boost through alias
        alias.points += boost;

        if (alias.points > 100) {
            alias.points = 100;
        }

        // Step 4: create checkpoint as separate object
        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;

        // Step 5: apply correction to live
        live.points -= correction;

        if (live.points < 0) {
            live.points = 0;
        }

        // Output
        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);
    }
}
