package Week03;

import java.util.Scanner;

class ScoreEditor {

    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read array size
        int size = scanner.nextInt();

        // Create array
        int[] scores = new int[size];

        // Read all scores
        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        // Read correction index and new score
        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        // Create ScoreEditor object
        ScoreEditor cs = new ScoreEditor();

        // Correct the score
        cs.correctScore(scores, correctionIndex, newScore);

        // Display updated scores
        cs.displayScores(scores);
    }
}
