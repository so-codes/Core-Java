package practicals;

import java.util.Scanner;

public class pr18 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter decimal number: ");
            int num = sc.nextInt();

            int rem = 0;
            while (num > 0) {
                rem = num % 2;
                System.out.print(rem);
                num = num / 2;
            }
        }
        System.out.print("\n\n");
    }
}
