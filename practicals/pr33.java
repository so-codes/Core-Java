package practicals;

import java.util.*;

public class pr33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        adding add = new adding();
        subbing sub = new subbing();
        add.calculate(a, b);
        sub.calculate(a, b);

        sc.close();
    }

}

abstract class number_stuff {
    abstract void calculate(int a, int b);
}

class adding extends number_stuff {

    void calculate(int a, int b) {
        System.out.println("Addition of two numbers is " + (a + b));
    }

}

class subbing extends number_stuff {

    void calculate(int a, int b) {
        System.out.println("Subtraction of two numbers is " + (a - b));
    }

}
