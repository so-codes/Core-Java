package practicals;

import java.util.Scanner;

public class pr19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter first binary number: ");
            int num1 = sc.nextInt();

            System.out.print("\nEnter second binary number: ");
            int num2 = sc.nextInt();

            int carry = 0;
            int rem = 0;

            while (num1 > 0 || num2 > 0) {
                rem = (num1 % 10) + (num2 % 10) + carry; // ( 101 % 10 ) + ( 100 % 10 ) + 0
                carry = rem / 2; // ( 101 % 10 ) + ( 100 % 10 ) + 0 / 2 = 1
                rem = rem % 2; // 1 % 2 = 1
                System.out.print(rem); // 1
                num1 = num1 / 10; // 101 / 10 = 10
                num2 = num2 / 10; // 100 / 10 = 10
            }
        }
        System.out.print("\n\n");
    }
}
