package base.packages.add_pkg;

import java.util.*;

public class Total_show {
    public static void main(String[] args) {

        System.out.print("Enter 2 numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addTst x = new addTst(a, b);

            System.out.print("Addition is " + x.sum());
            System.out.print("\n\n");

            System.out.print("Enter 2 numbers: ");
            int c = sc.nextInt();
            int d = sc.nextInt();
            subTst y = new subTst(c, d);

            System.out.println("Subtraction is " + y.sub());
            System.out.println();
        }
    }
}
