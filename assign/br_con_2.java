package assign;

public class br_con_2 {
    // Explain break and continue keyword with proper example.

    // break keyword is used to break out of the loop.
    // continue keyword is used to skip the current iteration of the loop.
    // break and continue keyword is used to break out of the loop and skip the
    // current iteration of the loop.

    // break keyword in code snippet:
    public static void main(String[] args) {

        System.out.println("Example of break keyword");

        // break keyword in code snippet:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n");

        System.out.println("Example of continue keyword");

        // continue keyword in code snippet:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
