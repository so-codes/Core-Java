package base.basics;

import java.util.*;

public class sum_avg {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {

            int[] num = new int[3];

            System.out.print("\nEnter three numbers: ");

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            int numsum = num[0] + num[1] + num[2];
            int numavg = numsum / 3;

            System.out.println("The sum is " + numsum);
            System.out.println("The average is " + numavg);
        }
    }
}
