package practicals;

import java.util.*;

public class pr25 {

    public static void main(String[] args) {

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter two numbers: ");
            int a = pog.nextInt();
            int b = pog.nextInt();

            if (a == b) {
                System.out.println("Both are equal");
            } else {
                int max = max(a, b);
                System.out.println("Maximum number is: " + max + "\n");
            }
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
