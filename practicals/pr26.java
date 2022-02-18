package practicals;

import java.util.Scanner;

public class pr26 {

    public static void main(String[] args) {

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter first name: ");
            String firstName = pog.nextLine();
            System.out.print("\nEnter last name: ");
            String lastName = pog.nextLine();

            Author author = new Author(firstName, lastName);

            System.out.println("\n");
            System.out.println("Author's first name is: " + author.getFirstName());
            System.out.println("Author's last name is: " + author.getLastName() + "\n");
        }
    }

    public static class Author {
        private String firstName;
        private String lastName;

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

}
