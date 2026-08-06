package Week01;

public class WeeklyPraticePlanner {
    public static void main(String[] args) {
        int praticeDays = 5;
        int sessionPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSession = 7;
        int completedSessions = 0;

        for (int i = 1; i <= praticeDays; i++) {
            if (i == revisionDay) {
                continue;
            }
            for (int j = 1; j <= sessionPerDay; j++) {
                if (i == 5 && j == 2) {
                    break;
                }
                System.out.println("Day " + i + " - Session " + j);
                completedSessions++;
            }

        }
        System.out.println("Completed Sessions:" + completedSessions);
        if (completedSessions == targetSession) {
            System.out.println("Target Achieved");
        }

    }
}
