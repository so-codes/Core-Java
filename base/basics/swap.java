package base.basics;

public class swap {

    public static void main(String[] args) {

        int a = 5, b = 10, c;
        System.out.print("\nThe two numbers are a = " + a + " b = " + b + " - Before swapping\n");

        c = a;
        a = b;
        b = c;

        System.out.print("\nThe two numbers are a = " + a + " b = " + b + " - After swapping\n\n");
    }
}
