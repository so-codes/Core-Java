package base.basics;

import java.util.*;

public class equals {
    public static void main(String[] args) {
        // String str = "criz";
        // String pog = "criz";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter str1: ");
            String str1 = sc.next();
            System.out.print("\nEnter str2: ");
            String str2 = sc.next();

            System.out.println(str1.equalsIgnoreCase(str2));
        }
    }
}
