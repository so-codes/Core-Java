package practicals;

import java.util.*;

public class pr27 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n");

            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            pr27 obj = new pr27(num);
            obj.display();
        }
    }

    int num;
    int fact = 1;

    pr27(int num) {
        this.num = num;
    }

    void display() {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("\nFactorial of " + num + " is " + fact + "\n");
    }

}
