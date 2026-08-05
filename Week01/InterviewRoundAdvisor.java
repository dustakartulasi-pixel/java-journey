package Week01;

public class InterviewRoundAdvisor {
    public static void main(String[] args) {
        int roundCode = 4;
        int attemptUsed = 2;
        int maxAttempt = 3;
        switch (roundCode) {
            case 1:
                System.out.println("Current Round: Aptitude");
                break;
            case 2:
                System.out.println("Current Round: Technical Round");
                break;
            case 3:
                System.out.println("Current Round: HR Round");
                break;
            case 4:
            case 5:
                System.out.println("Current Round: Final Review");
                break;
            default:
                System.out.println("Invalid Round");
        }

        String limit = attemptUsed <= maxAttempt ? "Attempt Available" : "Attempt Limit Reached";
        System.out.println("Attempt Status: " + limit);

    }

}
