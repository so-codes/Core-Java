package yeet;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        System.out.println("Criz !");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        String s = "hello";
        String p = s.toUpperCase();

        System.out.println(p);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            if (name.equals("criz")) {
                System.out.println("Hi Criz");
            } else {
                System.out.println("what !");
            }
        }
    }
}
