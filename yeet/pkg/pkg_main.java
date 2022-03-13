package yeet.pkg;

public class pkg_main {

    public String grading(int score) {
        String grade;
        if (score >= 90) {
            grade = "A";
            return grade;
        } else if (score >= 80) {
            grade = "B";
            return grade;
        } else if (score >= 70) {
            grade = "C";
            return grade;
        } else if (score >= 60) {
            grade = "D";
            return grade;
        } else {
            grade = "F";
            return grade;
        }
    }
}
