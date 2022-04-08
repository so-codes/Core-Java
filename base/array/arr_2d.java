package base.array;

import java.util.*;

public class arr_2d {
    public static void main(String[] args) {
        try (Scanner pog = new Scanner(System.in)) {
            int z[][] = new int[3][3];

            System.out.println();

            for (int i = 0; i < 3; i++) { // rows
                for (int j = 0; j < 3; j++) { // columns
                    System.out.print("Enter number at pos " + i + " " + j + ": ");
                    z[i][j] = pog.nextInt();
                }
            }
            System.out.println();

            for (int i = 0; i < 3; i++) { // rows
                for (int j = 0; j < 3; j++) { // columns
                    System.out.print(z[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
