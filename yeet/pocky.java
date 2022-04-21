package yeet;

import java.util.Scanner;

class pocky {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal :");
        Float mortgage1 = scanner.nextFloat();

        System.out.println("Intrest ");
        Float intrest = scanner.nextFloat();

        float monthlyinterest;
        monthlyinterest = intrest / 100 / 12;

        System.out.println("time taken : ");
        Float time = scanner.nextFloat();

        Float noOfPayments = time * 12;

        Float mortgage = (float) ((mortgage1 * monthlyinterest)
                / (1 - (1 / (Math.pow(1 + monthlyinterest, noOfPayments)))));

        System.out.println("Mortgage : $ " + mortgage);
        scanner.close();
    }
}