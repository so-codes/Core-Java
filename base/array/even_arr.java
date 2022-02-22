package base.array;

import java.util.*;

public class even_arr {
    public static void main(String[] args) {
        try (Scanner pog = new Scanner(System.in)) {
            int z[] = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number: ");
                z[i] = pog.nextInt();
            }
            System.out.println("\nEven numbers in the array:");
            for (int i = 0; i < 5; i++) {
                if (z[i] % 2 == 0) {
                    System.out.print(z[i] + " ");
                }
            }
        }
    }
}
