package yeet.pkg;

import java.util.*;

public class pkg_show {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your marks: ");
            int score = sc.nextInt();
            pkg_main m = new pkg_main();

            System.out.println("Your grade is " + m.grading(score));

        }
    }

}
