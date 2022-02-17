package base.packages.Max_pkg;

import java.util.*;

public class showmax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of test cases: ");
            double t = sc.nextInt();

            System.out.println();

            maxclass m = new maxclass();
            for (int i = 0; i < t; i++) {
                System.out.print("Enter the number: ");
                double a = sc.nextInt();

                System.out.print("Enter the number: ");
                double b = sc.nextInt();

                System.out.println("Max of " + a + " and " + b + " is " + m.max(a, b));
            }
            System.out.println();
        }
    }
}
