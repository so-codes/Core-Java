package base.conditions;

import java.util.*;

public class vowel {
    public static void main(String[] args) throws Exception {

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter a Character: ");

            // String str=pog.next();
            // System.out.println("String is: "+ str);
            // System.out.println("Char is: "+ str.charAt(0));

            char ch = pog.next().charAt(0);

            switch (ch) {
                case 'a':
                case 'A':
                    System.out.println(ch + " is a vowel");
                    break;

                case 'e':
                case 'E':
                    System.out.println(ch + " is a vowel");
                    break;

                case 'i':
                case 'I':
                    System.out.println(ch + " is a vowel");
                    break;

                case 'o':
                case 'O':
                    System.out.println(ch + " is a vowel");
                    break;

                case 'u':
                case 'U':
                    System.out.println(ch + " is a vowel");
                    break;

                default:
                    System.out.print(ch + " is not a vowel\n");
                    break;
            }
        }
    }
}
