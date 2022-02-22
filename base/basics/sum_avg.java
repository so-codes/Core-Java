package base.basics;

import java.util.*;

public class sum_avg {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter three numbers: ");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int sum, avg;
            sum = num1 + num2 + num3;

            // int avg1 = num1 / num1;
            // int avg2 = num2 / num2;
            // int avg3 = num3 / num3;

            // int sumavg = avg1 + avg2 + avg3;

            avg = sum / 3; // sumavg;

            System.out.print("\n\nSum of three numbers: " + sum + "\nAverage of three numbers: " + avg + "\n\n");
        }
    }
}
