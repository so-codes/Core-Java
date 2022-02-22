package base.array;

import java.util.*;

public class arrbase {
    public static void main(String[] args) {

        int age[] = { 1, 2, 3, 4, 5 };
        age[0] = 5;
        age[4] = 10;

        // for(int i = 0;i<5;i++){
        // System.out.println("Age at index "+ i +": "+ age[i]);
        // }

        System.out.println();

        int a[] = new int[5];
        try (Scanner pog = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number: ");
                a[i] = pog.nextInt();
            }

            System.out.println();

            for (int i = 0; i < 5; ++i) {
                System.out.println("Elements at index " + i + ": " + a[i]);
            }

            for (int x : a) {
                System.out.println(" " + x);
            }
        }
    }
}
