package practicals;

import java.util.Scanner;

public class pr21 {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int a[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
            int b[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

            int c[][] = new int[3][3];

            System.out.println("Enter matrix a");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            System.out.println("Enter matrix b");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    b[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            System.out.println("Matrix A");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("Matrix B");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
