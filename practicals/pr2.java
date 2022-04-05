package practicals;

import java.util.*;

public class pr2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter name: ");
            String str = sc.nextLine().toLowerCase();

            int cr = 1;
            int cr1 = 2;
            if (cr < cr1) {
                String pog = "criz";
                String pog2 = "pocky";

                if (str.equalsIgnoreCase(pog) || str.equalsIgnoreCase(pog2)) {
                    System.out.println("O.o its " + str);
                } else {
                    System.out.println("Name: " + str);
                }
            }

            System.out.print("\nEnter gender: ");
            char x = sc.next().charAt(0);

            if (x == 'F' || x == 'f') {
                System.out.println("User gender is female");
            } else if (x == 'M' || x == 'm') {
                System.out.println("User gender is male");
            } else {
                System.out.println("Invalid gender");
            }

            System.out.print("\nEnter the age: ");
            int n = sc.nextInt();
            System.out.println("The age is: " + n);

            System.out.print("\nEnter the phone no: ");
            long a = sc.nextLong();
            System.out.println("Phone No: " + a);

            System.out.print("\nEnter the percentage: ");
            float b = sc.nextFloat();
            System.out.println("Percentage: " + b);

            System.out.print("\nEnter double percent: ");
            double per_dou = sc.nextDouble();
            int per_int = (int) per_dou;
            System.out.println("Converting double % to int % : " + per_int);
        }
    }
}
