package base.packages;

import java.util.*;

public class CubeTst {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of test cases: ");
            int t = sc.nextInt();

            System.out.println();

            cubeclass c = new cubeclass();
            for (int i = 0; i < t; i++) {
                System.out.print("Enter the number: ");
                int n = sc.nextInt();
                System.out.println("Cube of " + n + " is " + c.cube(n));
            }
            System.out.println();
        }
    }
}
