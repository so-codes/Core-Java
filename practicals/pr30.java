package practicals;

import java.util.*;

class number_top {
    int num1;
    int num2;

    number_top(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void display5() {
        System.out.println("\nNumber 1: " + num1 + "\nNumber 2: " + num2);
    }
}

class Cmain extends CSub {

    Cmain(int num1, int num2) {
        super(num1, num2);
        System.out.println("Running both add and sub");
    }
}

class CAdd extends number_top {
    CAdd(int num1, int num2) {
        super(num1, num2);
        System.out.println("\nAddition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
}

class CSub extends CAdd {
    CSub(int num1, int num2) {
        super(num1, num2);
        System.out.println("\nSubtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }
}

public class pr30 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n");

            System.out.print("Enter the number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number 2: ");
            int num2 = sc.nextInt();

            // new CAdd(num1, num2);
            // new CSub(num1, num2);
            new Cmain(num1, num2);

        }
    }

}
