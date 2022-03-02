package assign;

class br_con_2 {
    public static void main(String[] args) {

        // break example

        System.out.println("\nBreak example");

        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue example

        System.out.println("\nContinue example");

        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}