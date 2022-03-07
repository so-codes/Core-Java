package base.basics;

import java.util.*;

public class concat {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter str1: ");
            String str = sc.next();
            System.out.print("\nEnter str2: ");
            String pog = sc.next();

            // String str = "criz";
            // String pog = "poggers";

            System.out.println(str.concat(pog));
        }
    }
}
