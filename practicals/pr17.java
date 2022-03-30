package practicals;

import java.util.Scanner;

public class pr17 {
    Scanner sc = new Scanner(System.in);
    int book_id;
    String book_name;
    double book_per;

    void insertbook() {
        System.out.print("Enter Book ID: ");
        book_id = sc.nextInt();
        System.out.print("Enter Book Name: ");
        book_name = sc.next();
        System.out.print("Enter Book Perc: ");
        book_per = sc.nextDouble();
    }

    void display() {
        System.out.println(" Book ID " + book_id);
        System.out.println(" Book Name " + book_name);
        System.out.println(" Book perc " + book_per);
    }

    public static void main(String ar[]) {
        pr17 s[] = new pr17[3];
        for (int i = 0; i < 3; i++) {
            s[i] = new pr17();
            s[i].insertbook();
        }
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
