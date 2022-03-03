package practicals;

import java.util.*;

class Programming {

    String lang;

    Programming() {
        System.out.println("\nI love Java");
    }

    Programming(String lang) {
        this.lang = lang;
        System.out.println("I love " + lang + "\n");
    }

}

public class pr28 {

    public static void main(String[] args) {
        new Programming();

        System.out.println("\n");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter some text: ");
            String lang = sc.nextLine();
            new Programming(lang);
        }
    }

}
