package practicals;

import java.util.Scanner;

class Add {
    int num1;
    int num2;

    Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("\nAddition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
}

class Multiply extends Add {
    Multiply(int num1, int num2) {
        super(num1, num2);
        System.out.println("\nMultiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }
}

class Divide extends Multiply {
    Divide(int num1, int num2) {
        super(num1, num2);
        System.out.println("\nDivision of " + num1 + " and " + num2 + " is " + (num1 / num2));
    }
}

public class pr31 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n");

            System.out.print("Enter the number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number 2: ");
            int num2 = sc.nextInt();

            new Divide(num1, num2);

        }
    }
}
