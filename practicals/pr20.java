package practicals;

import java.util.*;

public class pr20 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter 5 nos. in array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("\nSum of all elements in array: " + sum);
    }
}
