package Week01;

public class BolEx {
    public static void main(String[] args) {
        int marks = 60;
        int attendance = 85;
        boolean projectStatus = true;
        boolean res = (marks >= 60 && attendance >= 75 && projectStatus == true) ? true : false;
        System.out.println("Boolean Expression Result: " + res);
    }

}
